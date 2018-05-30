package Main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


import java.sql.*;
import com.mysql.*;


public class Objetos implements DetalleMetodos {
	static Logger log= Logger.getLogger(Objetos.class);
	
	//arreglo para usuarios
	List <String> idUs =new ArrayList();
	public void connectDB(){
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/Climusic","root","");
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
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/Climusic","root","");

			Statement estado= con.createStatement();
			ResultSet resultado= estado.executeQuery("SELECT doc_usser, pass_user FROM sys_account Where doc_usser = '"+
			usuario+"' AND pass_user = '"+ pass+"' ;");
			while(resultado.next()) {
				//idUs.add(resultado.getString("doc_usser"));
				//System.out.println(resultado.getString("doc_usser"));
				existe=true;
			}
			
		}catch(SQLException ex) {
			System.out.println("Error mysql");
		}catch(Exception e) {
			System.out.println("se ha encontrado un error: "+e.getMessage());
		}
		
		return existe;
		
	}

	



	@Override
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

	@Override
	public void listaGuitarra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean comprueboAdmin(String user) {
		BasicConfigurator.configure();
		boolean esAdmin=false;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		
			java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/Climusic","root","");
			
			Statement estado= con.createStatement();
			
			ResultSet resultado= estado.executeQuery("SELECT permiso FROM sys_account WHERE permiso ='admin' AND doc_usser ='"+user+"';");
			
			while(resultado.next()) {
				
				String res= resultado.getString("permiso");
				
				if(res.equals("admin")) {
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
	