package com.Climusic.InsertSql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.Climusic.Daos.EmpleadoDao;
import com.Climusic.Modelos.Empleado;

public class InsertProductos {
	
	public void InsertEmpleado(String nombre,String apellido,String documento,String password, String email,int permiso) {
		ApplicationContext application= new ClassPathXmlApplicationContext("Spring.xml");
		EmpleadoDao empleadodao = (EmpleadoDao) application.getBean("EmpleadoDao"); 
		Empleado empleado = new Empleado();
		empleado.setNombre(nombre);
		empleado.setApellido(apellido);
		empleado.setDocumento(documento);
		empleado.setPassword(password);
		empleado.setEmail(email);
		empleado.setPermiso(permiso);
		try {
			empleadodao.save(empleado);
			System.out.println("Registro salvado exitosamente");
			
		}catch(CannotGetJdbcConnectionException ex){
			ex.printStackTrace();
		}catch(DataAccessException e) {
			e.printStackTrace();
		}
		((ClassPathXmlApplicationContext)application).close();
		
	}

}
