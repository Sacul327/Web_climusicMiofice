package com.Climusic.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


import com.Climusic.Modelos.Carro;
import com.Climusic.Modelos.Empleado;

public class CarroRowMapper implements RowMapper<Carro> {
	
	@Override
	public Carro mapRow(ResultSet rs, int rowNum) throws SQLException {
			Carro cart = new Carro();
			cart.setId_instrumento(rs.getInt("id_instrumento"));
			cart.setId_factura(rs.getInt("id_factura"));
			cart.setCantidad(rs.getInt("cantidad"));			
			return cart;
		}

}
