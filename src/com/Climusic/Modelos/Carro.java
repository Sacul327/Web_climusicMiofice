package com.Climusic.Modelos;

public class Carro {
	
	private int id_factura,id_instrumento;

	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public int getId_instrumento() {
		return id_instrumento;
	}

	public void setId_instrumento(int id_instrumento) {
		this.id_instrumento = id_instrumento;
	}

	

	public Carro(int id_factura, int id_instrumento, int cantidad) {
		this.id_factura = id_factura;
		this.id_instrumento = id_instrumento;
	}

	public Carro() {

	}
	
	

}
