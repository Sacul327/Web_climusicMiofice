package com.Climusic.Daos;

import java.util.List;

import com.Climusic.Productos.Productos;


public interface ProductoDao {
	
	public boolean save(Productos producto);
	public List<Productos> buscarTodos();
	public Productos buscarXId(int id_empleado);
	public List<Productos> buscarXModelo(String modelo);
	public List<Productos> buscarXTipo(String tipo);
	public boolean actualizar(Productos admin);
	public boolean borrar(int id_empleado);
	public int[] grabarTodos(List<Productos> empleado);

}
