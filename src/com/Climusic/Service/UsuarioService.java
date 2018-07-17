package com.Climusic.Service;

import java.util.List;



import com.Climusic.Daos.EmpleadoDao;
import com.Climusic.Modelos.Empleado;

public class UsuarioService {
	
	private EmpleadoDao empleadoDao;
	
	
	public List<Empleado> buscarTodos(){
		return empleadoDao.buscarTodos();
	}
	

}
