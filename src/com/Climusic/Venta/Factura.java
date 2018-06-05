package com.Climusic.Venta;

import java.util.List;

import com.Climusic.Modelos.Accesorio;
import com.Climusic.Modelos.Empleado;
import com.Climusic.Modelos.Instrumento;

import java.util.ArrayList;

public class Factura extends VentaxUnidad{
	
	Empleado cli=new Empleado();
	Instrumento vendIns= new Instrumento();
	Accesorio vendAcc = new Accesorio();
	List<Empleado> histCompras= new ArrayList();
	
	/*public void conTarjeta(String document, String email, String nombre, String nroTarjeta) {
		cli.setDocument(document);
		cli.setEmail(email);
		cli.setNombre(nombre);
		cli.setNroTarjeta(nroTarjeta);
		histCompras.add(cli);
	}
	
	public void mostrarListConTarjeta() {
		System.out.println(cli.getDocument());
		System.out.println(cli.getEmail());
		System.out.println(cli.getNombre());
		System.out.println(cli.getNroTarjeta());
	}

	*/
	
}
