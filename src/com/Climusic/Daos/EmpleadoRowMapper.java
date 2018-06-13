package com.Climusic.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Climusic.Modelos.Empleado;

public class EmpleadoRowMapper implements RowMapper<Empleado> {

	@Override
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
	}


