package com.Climusic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Climusic.Daos.EmpleadoDaoImpl;
import com.Climusic.InsertSql.InsertEmpleado;

/**
 * Servlet implementation class ServletUsuarios
 */
@WebServlet("/ServletUsuarios")
public class ServletUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String nombre= request.getParameter("nombre");
		String apellido= request.getParameter("apellido");
		String documento= request.getParameter("documento");
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		System.out.println(contrasena);
		String privilegio = request.getParameter("privilegio");
		int privilegioInt = Integer.parseInt(privilegio);
		InsertEmpleado emp= new InsertEmpleado();
		emp.InsertEmpleado(nombre, apellido, documento, contrasena, email, privilegioInt);
		
		
	}

}
