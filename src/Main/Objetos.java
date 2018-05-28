package Main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.mysql.*;


public class Objetos implements DetalleMetodos {

	//arreglo para usuarios
	List <String> idUs =new ArrayList();
	public void connectDB(){
		try {
			System.out.println("Intento conectarme");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/Climusic","root","");
			System.out.println("sigo intentando");
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

	public boolean listaUsuarios(String usuario,String contraseña) {
		boolean existe=false;
		try {
			System.out.println("Intento conectarme");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/Climusic","root","");
			System.out.println("sigo intentando");

			Statement estado= con.createStatement();
			ResultSet resultado= estado.executeQuery("SELECT * FROM sys_account Where doc_usser = '"+
			usuario+"' AND pass_user = '"+ contraseña+"' ;");
			
			while (resultado.next()) {
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
			System.out.println("Bienvenido "+ user);
			existe=true;
		}else {
			System.out.println("usuario o contrase�a incorrecta");
		}
		return existe;

	}

	@Override
	public void listaGuitarra() {
		// TODO Auto-generated method stub
		
	}

	
	
		
	
	

}
