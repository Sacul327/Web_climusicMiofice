package Venta;

import java.util.List;
import java.util.ArrayList;

import Modelos.Accesorio;
import Modelos.Cliente;
import Modelos.Instrumento;

public class Factura extends VentaxUnidad{
	
	Cliente cli=new Cliente();
	Instrumento vendIns= new Instrumento();
	Accesorio vendAcc = new Accesorio();
	List<Cliente> histCompras= new ArrayList();
	
	public void conTarjeta(String document, String email, String nombre, String nroTarjeta) {
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

	
	
}
