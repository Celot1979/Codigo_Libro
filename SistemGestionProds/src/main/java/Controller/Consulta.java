package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BBDD;
import Model.Producto;

/**
 * Servlet implementation class Consulta
 */
@WebServlet("/Consulta")
public class Consulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consulta() {
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
		int clave =  Integer.parseInt(request.getParameter("clave"));
		String nombre =request.getParameter("nombre");
		System.out.println("Hola mundo");
		try {
			Producto producto;
			BBDD gestorBBDD = new BBDD();
			producto = gestorBBDD.Consultar(clave, nombre);
			if(producto != null) {
				request.setAttribute("atribAlumn",producto); 
				request.getRequestDispatcher("/Vista_Consulta_Registro.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("/NoEncontrado.jsp").forward(request, response);
			}
			
			
	
	        }finally {
	        	System.out.println("Terminado");
	        }

	}
}
