package com.Climusic.Pruebas;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.Climusic.Main.Objetos;

public class TestMetodos {
	static Logger log= Logger.getLogger(Objetos.class);
	
	public void connectDB(){
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			java.sql.Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=climusic","sa","123456");
			Statement estado= con.createStatement();
			ResultSet resultado= estado.executeQuery("SELECT * FROM productos");
			System.out.println("marca \t modelo \t color");
			while (resultado.next()) {
				System.out.println(resultado.getString("marca")+" \t "+resultado.getString("modelo")+" \t "+resultado.getString("color"));
			}
			
		}catch(SQLException ex) {
			System.out.println("Error mysql");
		}catch(Exception e) {
			System.out.println("se ha encontrado un error: "+e.getMessage());
		}

	}

	public boolean listaUsuarios(String usuario,String pass) {
		boolean existe=false;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			
			java.sql.Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=climusic","sa","123456");

			Statement estado= con.createStatement();
			ResultSet resultado= estado.executeQuery("SELECT documento , contraseña FROM empleado Where documento = '"+
			usuario+"' AND contraseña = '"+ pass+"' ;");
			while(resultado.next()) {
				//idUs.add(resultado.getString("doc_usser"));
				//System.out.println(resultado.getString("doc_usser"));
				existe=true;
			}
			
		}catch(SQLException ex) {
			System.out.println("Error sql");
		}catch(Exception e) {
			System.out.println("se ha encontrado un error: "+e.getMessage());
		}
		
		return existe;
		
	}

	




	public boolean checkUser(String user, String pass) {
		boolean existe=false;
		if(listaUsuarios(user, pass) == true) {
			//System.out.println("Bienvenido "+ user);
			existe=true;
		}//else {
			//System.out.println("usuario o contraseña incorrecta");
		//}
		return existe;

	}

	
	public void listaGuitarra() {
		// TODO Auto-generated method stub
		
	}

	public boolean comprueboAdmin(String user) {
		BasicConfigurator.configure();
		boolean esAdmin=false;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		
			java.sql.Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=climusic","sa","123456");
			
			Statement estado= con.createStatement();
			
			//ResultSet resultado= estado.executeQuery("SELECT permiso FROM sys_account WHERE id_permiso =2 AND doc_usser ='"+user+"';");
			
			ResultSet resultado= estado.executeQuery("select id_permiso,empleado.documento from sys_permiso join empleado on empleado.permiso = sys_permiso.id_permiso where id_permiso = 2 AND documento='"+user+"';");
			
			while(resultado.next()) {
				
				String res= resultado.getString("id_permiso");
				
				if(res.equals("2")) {
					esAdmin=true;
				}
				
			}
		}catch(SQLException ex) {
			
			log.error("Error mysql");
			
		}catch(Exception e) {
			
			log.error("se ha encontrado un error: "+e.getMessage());
			
		}
		
		return esAdmin;
	}

}
