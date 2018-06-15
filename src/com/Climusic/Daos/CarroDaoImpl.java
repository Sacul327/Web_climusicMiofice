package com.Climusic.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;


import com.Climusic.Modelos.Carro;
import com.Climusic.Productos.Productos;
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
	public List<Productos> buscarTodos(/*int x*/) {
		return jdbcTemplate.query("select productos.id_instrumento,productos.marca,productos.modelo,productos.precio,productos.color,productos.tipo from carro INNER JOIN productos ON carro.id_instrumento = productos.id_instrumento;" /*where id_factura="+x*/, new RowMapper<Productos>() {

			public Productos mapRow(ResultSet rs, int rowNum) throws SQLException {
				Productos prod = new Productos();
				prod.setId_instrumento(rs.getInt("id_instrumento"));
				prod.setMarca(rs.getString("marca"));
				prod.setModelo(rs.getString("modelo"));
				prod.setPrecio(rs.getFloat("precio"));
				prod.setColor(rs.getString("color"));
				prod.setTipo(rs.getString("tipo"));
				return prod;
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
	public boolean borrar(int id_instrumento) {
		return jdbcTemplate.update("delete from carro Where id_instrumento="+id_instrumento, new MapSqlParameterSource("id_instrumento",id_instrumento
				)) == 1;
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
