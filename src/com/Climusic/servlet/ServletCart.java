package com.Climusic.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;


import com.Climusic.Daos.CarroDao;
import com.Climusic.InsertSql.InsertCarro;


/**
 * Servlet implementation class ServletCart
 */
@WebServlet("/ServletCart")
public class ServletCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCart() {
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
		String strProducto=request.getParameter("NroProducto");
		String strCantidad=request.getParameter("cantidad");
		int nroProducto= Integer.parseInt(strProducto);
		int nroCantidad= Integer.parseInt(strCantidad);
		InsertCarro cart= new InsertCarro();
		cart.InsertCarro(nroCantidad, nroProducto);
		
	}

}
