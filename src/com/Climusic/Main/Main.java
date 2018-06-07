package com.Climusic.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.Climusic.Daos.EmpleadoDao;
import com.Climusic.Daos.EmpleadoDaoImpl;
import com.Climusic.Daos.ProductoDao;
import com.Climusic.Productos.Productos;

public class Main {

	
	public static void main(String[]args) {
		ApplicationContext application= new ClassPathXmlApplicationContext("Spring.xml");
		ProductoDao prod = (ProductoDao) application.getBean("ProductoDao"); 
		MethodoProbar met= new MethodoProbar();
		try {
		
		
			List<Productos> listPro= prod.buscarTodos();
			
			for (Productos pro2 : listPro) {
					pro2.getMarca();
					pro2.getModelo();
					pro2.getPrecio();
					pro2.getStock();
					pro2.getColor();
					pro2.getTipo();
					pro2.getTipo_detalle();
			}
		 }catch(CannotGetJdbcConnectionException ex) {
					ex.printStackTrace();
				} catch (DataAccessException e) {
					e.printStackTrace();
				}
		List<Productos>listPro = prod.buscarTodos();
		
		met.AgregarLista(listPro, 1);
	
		
		((ClassPathXmlApplicationContext) application).close();

		
		
	}
	
}
