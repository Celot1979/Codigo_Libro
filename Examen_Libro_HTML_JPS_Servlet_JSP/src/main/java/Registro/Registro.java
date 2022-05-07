package Registro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Guardar.Archivos;
import Registro.Escribir;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
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
		String clave = request.getParameter("clave");
		String nombre =request.getParameter("nombre");
		String precio = request.getParameter("precio");
		String cantidad =request.getParameter("cantidad");
		Archivos nuevo = new Archivos(clave, nombre,precio,cantidad);
		Escribir texto = new Escribir(nuevo);
		request.setAttribute("atribAlumn",nuevo); 
		request.getRequestDispatcher("/Vista_Usuario_Registro.jsp").forward(request, response);
	}

}
