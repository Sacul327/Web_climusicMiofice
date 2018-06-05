package com.Climusic.Daos;

import java.util.List;

import com.Climusic.Modelos.Empleado;

public interface EmpleadoDao {

	public boolean save(Empleado producto);
	public List<Empleado> buscarTodos();
	public Empleado buscarXId(int id_empleado);
	public List<Empleado> buscarXNombreApellido(String nombre,String apellido);
	public boolean actualizar(Empleado admin);
	public boolean borrar(int id_empleado);
	public void grabarTodos();
	
}
