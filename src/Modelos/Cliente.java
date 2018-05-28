package Modelos;

public class Cliente {
	
	private String nombre,Document,email,nroTarjeta;

	public Cliente(String nombre, String document, String email) {
		
		this.nombre = nombre;
		Document = document;
		this.email = email;
	}
	
	public Cliente() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocument() {
		return Document;
	}

	public void setDocument(String document) {
		Document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}
	
	
	
	
	

}
