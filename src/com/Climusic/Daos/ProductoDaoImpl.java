package com.Climusic.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
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
import com.Climusic.Modelos.Productos;

@Transactional
@Repository
@Component("ProductoDao")
public class ProductoDaoImpl implements ProductoDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {	
			return sessionFactory.getCurrentSession();
	}
	

	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate= new NamedParameterJdbcTemplate((javax.sql.DataSource)dataSource);
	}	
	
	@Override
	public boolean save(Productos producto) {
		/*MapSqlParameterSource paramMap=new MapSqlParameterSource();
		System.out.println(empleado.toString());
		paramMap.addValue("nombre", empleado.getNombre());
		paramMap.addValue("apellido", empleado.getApellido());
		paramMap.addValue("email", empleado.getEmail());
		paramMap.addValue("documento", empleado.getDocumento());
		paramMap.addValue("contraseÃ±a", empleado.getContraseÃ±a());
		paramMap.addValue("permiso", empleado.getPermiso());*/
		BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(producto);
		return jdbcTemplate.update("insert into empleado(nombre,apellido,email,documento,contraseña,permiso) values(:nombre,:apellido,:email,:documento,:contraseña,:permiso)", paramMap) == 1;
	}

	@Override
	public List<Productos> buscarTodos() {
			List<Productos> prod= null;
			Query q = (Query) getSession().createQuery("select * from Admin");
			prod=q.list();
			return prod;
	}



	@Override
	public boolean actualizar(Productos producto) {
		return jdbcTemplate.update("Update empleado set nombre:nombre, apellido:apellido, email:email, documento:documento, contraseña:contraseña, permiso:permiso where id_empleado=:id_empleado ", 
				new BeanPropertySqlParameterSource(producto)) == 1;
	}

	@Override
	public boolean borrar(int id_instrumento) {
		System.out.println(id_instrumento);
		return jdbcTemplate.update("delete from empleado Where id_empleado="+id_instrumento, new MapSqlParameterSource("id_empleado",id_instrumento
				)) == 1;
	}
	
	@Override
	public int[] grabarTodos(List<Productos> producto) {
		SqlParameterSource[] batchArgs = SqlParameterSourceUtils.createBatch(producto.toArray());
		return jdbcTemplate.batchUpdate("insert into productos (nombre,apellido,documento,email,contraseña,privilegio) values (:nombre,:apellido,:documento,:email,:contraseña,:privilegio)", batchArgs);
		
	}

	@Override
	public Productos buscarXId(int id_empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productos> buscarXModelo(String modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productos> buscarXTipo(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Productos> buscarXModelo(String modelo) {
		return jdbcTemplate.queryForList("Select * from productos where modelo like :modelo", new MapSqlParameterSource("modelo", "%" + modelo + "%"),new ProductoRowMapper());
	}

	@Override
	public List<Productos> buscarXTipo(String marca) {
		return jdbcTemplate.query("Select * from productos where marca like :marca",new MapSqlParameterSource("marca", "%" + marca + "%"), new ProductoRowMapper());
	}

	@Override
	public Productos buscarXId(int id_instrumento) {
		return jdbcTemplate.queryForObject("Select * from productos where id_instrumento = :id_instrumento",new MapSqlParameterSource("id_instrumento", "%" + id_instrumento + "%"), new ProductoRowMapper());
	}*/

}