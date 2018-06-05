package com.Climusic.Modelos;

public class Instrumento {

	private String material,marca,codProducto,modelo;
	private int stock;
	private double precio;
	
	
	public Instrumento() {
	}
	
	public Instrumento(String material, String marca, String codProducto, int stock, double precio) {
		this.material = material;
		this.marca = marca;
		this.codProducto = codProducto;
		this.stock = stock;
		this.precio = precio;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
