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
		MapSqlParameterSource paramMap=new MapSqlParameterSource();
		System.out.println(empleado.toString());
		paramMap.addValue("nombre", empleado.getNombre());
		paramMap.addValue("apellido", empleado.getApellido());
		paramMap.addValue("email", empleado.getEmail());
		paramMap.addValue("documento", empleado.getDocumento());
		paramMap.addValue("contraseña", empleado.getContraseña());
		paramMap.addValue("permiso", empleado.getPermiso());
		return jdbcTemplate.update("insert into empleado(nombre,apellido,email,documento,contraseña,permiso) values(:nombre,:apellido,:email,:documento,:contraseña,:permiso)", paramMap) == 1;
	}

	@Override
	public List<Empleado> buscarTodos() {
		return jdbcTemplate.query("Select * from Admin", new RowMapper<Empleado>() {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> buscarXNombreApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean actualizar(Empleado admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean borrar(int id_empleado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void grabarTodos() {
		// TODO Auto-generated method stub
		
	}

}
