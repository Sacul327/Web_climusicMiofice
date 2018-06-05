package com.Climusic.Modelos;

public class Accesorio {
	
	String tipoNom,nombre,marca;
	int tipoId,stock;
	double precio;
	
	
	
	public Accesorio() {
		
	}
	
	public Accesorio(String tipoNom, String nombre, String marca, int tipoId, double precio, int stock) {
		
		this.tipoNom = tipoNom;
		this.nombre = nombre;
		this.marca = marca;
		this.tipoId = tipoId;
		this.precio = precio;
		this.stock = stock;
	}
	public String getTipoNom() {
		return tipoNom;
	}
	public void setTipoNom(String tipoNom) {
		this.tipoNom = tipoNom;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTipoId() {
		return tipoId;
	}
	public void setTipoId(int tipoId) {
		this.tipoId = tipoId;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	

}
