package com.Climusic.Modelos;

public class Empleado {
	
	private int id_empleado,permiso;
	private String nombre,apellido,documento,password,email;
	
	
	public int getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	public int getPermiso() {
		return permiso;
	}
	public void setPermiso(int permiso) {
		this.permiso = permiso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Empleado(int id_empleado, int permiso, String nombre, String apellido, String documento, String password,
			String email) {
		this.id_empleado = id_empleado;
		this.permiso = permiso;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.password = password;
		this.email = email;
	}
	public Empleado() {
	
	}
	@Override
	public String toString() {
		return "Productos [id_empleado=" + id_empleado + ", permiso=" + permiso + ", nombre=" + nombre + ", apellido="
				+ apellido + ", documento=" + documento + ", password=" + password + ", email=" + email + "]";
	}
	
	


}
