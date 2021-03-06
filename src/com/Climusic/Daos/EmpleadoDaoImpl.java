package com.Climusic.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Climusic.Modelos.Empleado;

@Transactional
@Repository
@Component("EmpleadoDao")
public class EmpleadoDaoImpl implements EmpleadoDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	
	public Session getSession() {	
		return sessionFactory.getCurrentSession();
}
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate= new NamedParameterJdbcTemplate((javax.sql.DataSource)dataSource);
	}	
	
	@Override
	public boolean save(Empleado empleado) {
		BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(empleado);
		return jdbcTemplate.update("insert into empleado(nombre,apellido,email,documento,password,permiso) values(:nombre,:apellido,:email,:documento,:password,:permiso)", paramMap) == 1;
	}

	@Override
	public List<Empleado> buscarTodos() {
		return jdbcTemplate.query("Select * from empleado", new RowMapper<Empleado>() {

			public Empleado mapRow(ResultSet rs, int rowNum) throws SQLException {
				Empleado emp = new Empleado();
				emp.setId_empleado(rs.getInt("id_empleado"));
				emp.setNombre(rs.getString("nombre"));
				emp.setApellido(rs.getString("apellido"));
				emp.setDocumento(rs.getString("documento"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setPermiso(rs.getInt("permiso"));
				return emp;
			}
		});
	}

	/*@Override
	public Empleado buscarXId(int id_empleado) {
		return jdbcTemplate.queryForObject("Select * from empleado where id_empleado = :id_empleado", new MapSqlParameterSource("id_empleado",id_empleado),new EmpleadoRowMapper());
	}*/
	
	@Override
	public Empleado buscarXEmail(String email) {
		System.out.println(getSession().get(Empleado.class, email));
		return getSession().get(Empleado.class, email);
	}

	@Override
	public List<Empleado> buscarXNombre(String nombre/*, String apellido*/) {
		return jdbcTemplate.query("Select * from empleado where nombre like :nombre",new MapSqlParameterSource("nombre", "%" + nombre + "%"), new EmpleadoRowMapper());
	}

	@Override
	public boolean actualizar(Empleado empleado) {
		return jdbcTemplate.update("Update empleado set nombre:nombre, apellido:apellido, email:email, documento:documento, password:password, permiso:permiso where id_empleado=:id_empleado ", 
				new BeanPropertySqlParameterSource(empleado)) == 1;
	}

	@Override
	public boolean borrar(int id_empleado) {
		System.out.println(id_empleado);
		return jdbcTemplate.update("delete from empleado Where id_empleado="+id_empleado, new MapSqlParameterSource("id_empleado",id_empleado
				)) == 1;
	}
	
	@Override
	public int[] grabarTodos(List<Empleado> empleado) {
		SqlParameterSource[] batchArgs = SqlParameterSourceUtils.createBatch(empleado.toArray());
		return jdbcTemplate.batchUpdate("insert into empleado (nombre,apellido,documento,email,password,privilegio) values (:nombre,:apellido,:documento,:email,:password,:privilegio)", batchArgs);
		
	}

	@Override
	public boolean listaEmpleados(String email, String password) {
		boolean existe=false;
		Empleado emp= jdbcTemplate.queryForObject("Select * from empleado where email=:email", new MapSqlParameterSource("email",email),new EmpleadoRowMapper());
//		System.out.println(emp.getEmail()+"-----"+emp.getPassword());
//		System.out.println(email+"----"+password);
		if(email.equals(emp.getEmail()) & password.equals(emp.getPassword())) {
			existe=true;
				System.out.println("logre comprobar que el email y usuario estan dentrode la base");
		}
		System.out.println(getSession());
		return existe;
	}

	@Override
	public boolean checkUser(String user, String pass) {
		boolean existe=false;
		if(listaEmpleados(user, pass) == true) {
			existe=true;
			System.out.println("El usuario es correcto");
		}else {
			System.out.println("El usuario es incorrecto!");
		}
		return existe;
	}

	@Override
	public boolean comprueboAdmin(String email) {
		boolean existe=false;
		Empleado emp= jdbcTemplate.queryForObject("Select * from empleado where email=:email", new MapSqlParameterSource("email",email),new EmpleadoRowMapper());
		if(emp.getPermiso()==1) {
			existe=true;
			System.out.println("Es admin");
		}
		
		return existe;
	}

}
