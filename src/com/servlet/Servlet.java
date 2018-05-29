package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import Main.Objetos;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	static Logger log = Logger.getLogger(Objetos.class);
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BasicConfigurator.configure();
		PrintWriter out = response.getWriter();
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		Objetos obj = new Objetos();
		if(obj.checkUser(email, password)) {
			log.info("Bienvenido "+email);
		}else {
			log.warn("Usuario o contraseña incorrecta");
		}
		System.out.println(obj.comprueboAdmin(email));
		request.getRequestDispatcher("Probando.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
