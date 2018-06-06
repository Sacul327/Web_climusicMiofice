package com.Climusic.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;

import com.Climusic.Modelos.Empleado;

@Component("EmpleadoDao")
public class EmpleadoDaoImpl implements EmpleadoDao {

	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate= new NamedParameterJdbcTemplate((javax.sql.DataSource)dataSource);
	}	
	
	@Override
	public boolean save(Empleado empleado) {
		/*MapSqlParameterSource paramMap=new MapSqlParameterSource();
		System.out.println(empleado.toString());
		paramMap.addValue("nombre", empleado.getNombre());
		paramMap.addValue("apellido", empleado.getApellido());
		paramMap.addValue("email", empleado.getEmail());
		paramMap.addValue("documento", empleado.getDocumento());
		paramMap.addValue("contraseña", empleado.getContraseña());
		paramMap.addValue("permiso", empleado.getPermiso());*/
		BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(empleado);
		return jdbcTemplate.update("insert into empleado(nombre,apellido,email,documento,contraseña,permiso) values(:nombre,:apellido,:email,:documento,:contraseña,:permiso)", paramMap) == 1;
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
				emp.setContraseña(rs.getString("contraseña"));
				emp.setPermiso(rs.getInt("permiso"));
				return emp;
			}
		});
	}

	@Override
	public Empleado buscarXId(int id_empleado) {
		return jdbcTemplate.queryForObject("Select * from empleado where id_empleado = :id_empleado", new MapSqlParameterSource("id_empleado",id_empleado),new EmpleadoRowMapper());
	}

	@Override
	public List<Empleado> buscarXNombre(String nombre/*, String apellido*/) {
		return jdbcTemplate.query("Select * from empleado where nombre like :nombre",new MapSqlParameterSource("nombre", "%" + nombre + "%"), new EmpleadoRowMapper());
	}

	@Override
	public boolean actualizar(Empleado empleado) {
		return jdbcTemplate.update("Update empleado set nombre:nombre, apellido:apellido, email:email, documento:documento, contraseña:contraseña, permiso:permiso where id_empleado=:id_empleado ", 
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
		return jdbcTemplate.batchUpdate("insert into empleado (nombre,apellido,documento,email,contraseña,privilegio) values (:nombre,:apellido,:documento,:email,:contraseña,:privilegio)", batchArgs);
		
	}

}
