package com.Climusic.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Climusic.Daos.EmpleadoDao;
import com.Climusic.Daos.EmpleadoDaoImpl;

public class Main {

	
	public static void main(String[]args) {
		ApplicationContext application= new ClassPathXmlApplicationContext("Spring.xml");
		EmpleadoDao empleadodao = (EmpleadoDao) application.getBean("EmpleadoDao"); 
		
		
		
	}
	
}
