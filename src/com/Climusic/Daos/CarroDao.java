package com.Climusic.Daos;

import java.util.List;

import com.Climusic.Modelos.Carro;

public interface CarroDao {
	
	public boolean save(Carro producto);
	public List<Carro> buscarTodos();
	public Carro buscarXId(int id_factura);
	public List<Carro> buscarXNombre(String nombre/*,String apellido*/);
	public boolean actualizar(Carro admin);
	public boolean borrar(int id_factura);
	public int[] grabarTodos(List<Carro> empleado);

}
