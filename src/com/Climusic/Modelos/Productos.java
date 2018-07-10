package com.Climusic.Modelos;

public class Productos {
	
	private String marca,modelo,tipo,tipo_detalle,color;
	private int id_instrumento,stock,proveedor_id;
	private float precio;
	
	
	
	
	
	public int getProveedor_id() {
		return proveedor_id;
	}
	public void setProveedor_id(int proveedor_id) {
		this.proveedor_id = proveedor_id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo_detalle() {
		return tipo_detalle;
	}
	public void setTipo_detalle(String tipo_detalle) {
		this.tipo_detalle = tipo_detalle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId_instrumento() {
		return id_instrumento;
	}
	public void setId_instrumento(int id_instrumento) {
		this.id_instrumento = id_instrumento;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Productos(String marca, String modelo, String tipo, String tipo_detalle, String color, int stock, int id_instrumento,
			float precio, int proveedor_id) {
		this.proveedor_id=proveedor_id;
		this.stock= stock;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.tipo_detalle = tipo_detalle;
		this.color = color;
		this.id_instrumento = id_instrumento;
		this.precio = precio;
	}
	public Productos() {
		
	}
	@Override
	public String toString() {
		return "Productos [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", tipo_detalle=" + tipo_detalle
				+ ", color=" + color + ", id_instrumento=" + id_instrumento + ", precio=" + precio + "]";
	}
	
	
	
	
}
