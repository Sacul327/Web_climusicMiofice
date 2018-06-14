package com.Climusic.InsertSql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.Climusic.Daos.CarroDao;
import com.Climusic.Modelos.Carro;

public class InsertCarro {
	
	public void InsertCarro(int id_instrumento) {
		ApplicationContext application= new ClassPathXmlApplicationContext("Spring.xml");
		CarroDao cartdao = (CarroDao) application.getBean("CarroDao"); 
		Carro cart = new Carro();
		cart.setId_instrumento(id_instrumento);
		cart.setId_factura(1);
		try {
			cartdao.save(cart);
			System.out.println("Registro salvado exitosamente");
			
		}catch(CannotGetJdbcConnectionException ex){
			ex.printStackTrace();
		}catch(DataAccessException e) {
			e.printStackTrace();
		}
		((ClassPathXmlApplicationContext)application).close();
		
	}

}
