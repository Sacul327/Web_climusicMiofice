package com.Climusic.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Climusic.Productos.Productos;

public class ProductoRowMapper {
	
	public Productos mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Productos pro = new Productos();
		pro.setId_instrumento(rs.getInt("id_instrumento"));
		pro.setMarca(rs.getString("marca"));
		pro.setPrecio(rs.getFloat("precio"));
		pro.setStock(rs.getInt("stock"));
		pro.setModelo(rs.getString("modelo"));
		pro.setTipo(rs.getString("tipo"));
		pro.setTipo_detalle("tipo_detalle");
		pro.setColor(rs.getString("color"));
		pro.setProveedor_id(rs.getInt("proveedor_id"));
		
		return pro;
	}

}
