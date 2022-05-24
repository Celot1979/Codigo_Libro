package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Base_Datos;
import model.Registro;

/**
 * Servlet implementation class Controlador_HTML_JSP_REGISTRAR
 */
@WebServlet("/Controlador_HTML_JSP_REGISTRAR")
public class Controlador_HTML_JSP_REGISTRAR extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador_HTML_JSP_REGISTRAR() {
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
		String clave =  request.getParameter("clave");
		String cuenta =request.getParameter("cuenta");
		String nombre =request.getParameter("nombre");
		String contra =request.getParameter("contra");
		String email =request.getParameter("email");
		int control = 0;
		Registro n_registro = new Registro(clave,cuenta,nombre,contra,email);
		n_registro.metodo();
		
		if(n_registro.metodo() != true) {
			request.setAttribute("atribAlumn",n_registro); 
			request.getRequestDispatcher("/Vista_Registro.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/No_Conectado.jsp").forward(request, response);
		}
		
		
		
	}

}
