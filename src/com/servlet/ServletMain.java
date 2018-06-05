package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import Main.Objetos;

/**
 * Servlet implementation class ServletMain
 */
@WebServlet("/ServletMain")
public class ServletMain extends HttpServlet {
	static Logger log = Logger.getLogger(Objetos.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		PrintWriter out = response.getWriter();
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		Objetos obj = new Objetos();
		//sesiones.
		if(obj.checkUser(email, password)) {
			log.info("Bienvenido "+email);
		}else {
			log.warn("Usuario o contraseña incorrecta");
		}
		if(obj.comprueboAdmin(email)==true) {
			System.out.println("llegue a compruebo y es TRUE");
		request.getRequestDispatcher("pantalla_ventas_admin.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("pantalla_ventas.jsp").forward(request, response);
		}
		
	}

}
