package com.Climusic.Daos;

import java.util.List;

import com.Climusic.Modelos.Carro;
import com.Climusic.Modelos.Productos;

public interface CarroDao {
	
	public boolean save(Carro producto);
	public List<Productos> buscarTodos(/*int x*/);
	public Carro buscarXId(int id_factura);
	public List<Carro> buscarXNombre(String nombre/*,String apellido*/);
	public boolean actualizar(Carro admin);
	public boolean borrar(int id_instrumento);
	public int[] grabarTodos(List<Carro> empleado);
	public boolean querycondatos();

}
