package com.Climusic.Pruebas;

import com.Climusic.Main.Objetos;

public class TestClass {
	
	
	public static void main(String[] args) {
		TestMetodos test= new TestMetodos();
		test.connectDB();
		String usuario = "12345678@cli.com";
		String pass = "asd123";
		System.out.println(test.checkUser(usuario, pass));
		Objetos obje = new Objetos();
		System.out.println(obje.checkUser(usuario, pass));
	
	}

}
