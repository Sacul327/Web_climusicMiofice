package com.Climusic.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;


import com.Climusic.Modelos.Carro;
import com.Climusic.Modelos.Carro;
@Component("CarroDao")
public class CarroDaoImpl implements CarroDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate= new NamedParameterJdbcTemplate((javax.sql.DataSource)dataSource);
	}	
	

	@Override
	public boolean save(Carro cart) {
		BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(cart);
		return jdbcTemplate.update("insert into carro(id_factura,id_instrumento) values(:id_factura,:id_instrumento)", paramMap) == 1;
	}

	@Override
	public List<Carro> buscarTodos(int x) {
		return jdbcTemplate.query("Select * from carro where id_factura="+x, new RowMapper<Carro>() {

			public Carro mapRow(ResultSet rs, int rowNum) throws SQLException {
				Carro cart = new Carro();
				cart.setId_instrumento(rs.getInt("id_instrumento"));
				cart.setId_factura(rs.getInt("id_factura"));
				return cart;
			}
		});
	}

	@Override
	public Carro buscarXId(int id_factura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carro> buscarXNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean actualizar(Carro admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean borrar(int id_factura) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[] grabarTodos(List<Carro> empleado) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean querycondatos() {
		// TODO Auto-generated method stub
		return false;
	}

}
