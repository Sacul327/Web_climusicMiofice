package com.Climusic.Productos;

import java.util.ArrayList;
import java.util.List;

import com.Climusic.Modelos.Accesorio;

public class Cuerdas {
	Accesorio cuerdas = new Accesorio();
	List<Accesorio> cuerdasList=new ArrayList();
	
	public void cargarParametros(String nombre, String tipoNom, String marca,double precio, int tipoId, int stock) {
		cuerdas.setMarca(marca);
		cuerdas.setNombre(nombre);
		cuerdas.setPrecio(precio);
		cuerdas.setTipoId(tipoId);
		cuerdas.setTipoNom(tipoNom);
		cuerdas.setStock(stock);
		cuerdasList.add(cuerdas); 
	}
	
	public String mostrarListCompleta() {
		for(int x=0;x<cuerdasList.size();x++) {
			  System.out.println("Caracteristicas del producto:");
			  System.out.println(cuerdasList.get(x).getTipoNom());
			  System.out.println(cuerdasList.get(x).getStock());
			  System.out.println(cuerdasList.get(x).getMarca());
			  System.out.println(cuerdasList.get(x).getTipoId());
			  System.out.println(cuerdasList.get(x).getPrecio());
			  System.out.println(cuerdasList.get(x).getNombre());
			}
		return null;
	}
	
	public String mostrarList() {
		for(int x=0;x<cuerdasList.size();x++) {
			  System.out.println("Caracteristicas del producto:");
			  System.out.println(cuerdasList.get(x).getTipoNom());
			  System.out.println(cuerdasList.get(x).getStock());
			  System.out.println(cuerdasList.get(x).getMarca());
			  System.out.println(cuerdasList.get(x).getTipoId());
			  System.out.println(cuerdasList.get(x).getPrecio());
			  System.out.println(cuerdasList.get(x).getNombre());
			}
		return null;
	}

}
