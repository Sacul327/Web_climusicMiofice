package com.Climusic.Main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.Climusic.Daos.ProductoDao;
import com.Climusic.Productos.Productos;

public class MethodoProbar {
	
	
	List<Productos> listMostrar= new ArrayList();
	
	public void espejoDos(List<Productos> x) {
		
		listMostrar=x;
		for(int i = 0;i<listMostrar.size();i++) {
			System.out.println("Que contiene el carrito de compra :"+listMostrar.get(i));
	}
		
	}

	public void espejoList(/*Productos add,*/List<Productos> x,int c) {
		//listMostrar=x;
		Productos add=x.get(c);
		listMostrar.add(add);
		for(int i = 0;i<listMostrar.size();i++) {
			System.out.println("Que contiene el carrito de compra :"+listMostrar.get(i));
	}
		
	}
	
	
	
	public void AgregarLista(List list,int x) {
		
		
		
		
		
		
	}
	
	public void addTry() {
		ApplicationContext app = new ClassPathXmlApplicationContext("Spring.xml");
		ProductoDao productodao = (ProductoDao) app.getBean("ProductoDao");
		try {
			listMostrar = productodao.buscarTodos();
			for (Productos pro2 : listMostrar) {
				System.out.println(pro2.getMarca());
				System.out.println(pro2.getModelo());
				System.out.println(pro2.getPrecio());
				System.out.println(pro2.getStock());
				System.out.println(pro2.getColor());
				System.out.println(pro2.getTipo());
				System.out.println(pro2.getTipo_detalle());

			}
		} catch (CannotGetJdbcConnectionException ex) {
			ex.printStackTrace();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	
	
}
