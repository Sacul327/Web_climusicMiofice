package com.Climusic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Climusic.Daos.CarroDao;
import com.Climusic.Daos.ProductoDao;
import com.Climusic.Modelos.Carro;
import com.Climusic.Productos.Productos;

@Service
public class PantVentaService {

	@Autowired
	private CarroDao carroDao;
	
	@Autowired
	private ProductoDao productoDao;
	
	public List<Productos> buscarTodos(){
		return carroDao.buscarTodos();
	}
	
	public List<Productos> buscarTodosPro(){
		return productoDao.buscarTodos();
	}
	
	
	
}
