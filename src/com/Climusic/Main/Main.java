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
					System.out.println(pro2.getMarca());
					System.out.println(pro2.getModelo());
					System.out.println(pro2.getPrecio());
					System.out.println(pro2.getStock());
					System.out.println(pro2.getColor());
					System.out.println(pro2.getTipo());
					System.out.println(pro2.getTipo_detalle());
			}
		 }catch(CannotGetJdbcConnectionException ex) {
					ex.printStackTrace();
				} catch (DataAccessException e) {
					e.printStackTrace();
				}
		List<Productos>listPro = prod.buscarTodos();
		System.out.println("************************MI OTRA LISTA****************************");

		met.espejoDos(listPro);
		//met.espejoList(listPro, 1);
		
		((ClassPathXmlApplicationContext) application).close();

		
		
	}
	
}
