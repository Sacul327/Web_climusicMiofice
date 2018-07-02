package com.Climusic.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Climusic.Daos.EmpleadoDao;

@Service
public class LoginService {
	
	private EmpleadoDao	empleadoDao;
	
	
	public boolean listaEmpleados(String email, String password) {
		return empleadoDao.listaEmpleados(email, password);
	}
	
	public boolean checkUser(String user, String pass) {
		return empleadoDao.checkUser(user, pass);
	}
	
	public boolean comprueboAdmin(String user) {
		return empleadoDao.comprueboAdmin(user);
	}
	
	

}
