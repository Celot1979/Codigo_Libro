package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BBDD;
import Controller.Archivos_Registro;
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
		int clave =  Integer.parseInt(request.getParameter("clave"));
		String nombre =request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));
		int cantidad =Integer.parseInt(request.getParameter("cantidad"));
		Archivos_Registro nuevo = new Archivos_Registro(clave,nombre,precio,cantidad);
		BBDD nuevo2 = new BBDD();
		nuevo2.resgistrar(clave, nombre, precio, cantidad);
		request.setAttribute("atribAlumn",nuevo); 
		request.getRequestDispatcher("/Vista_Usuario_Registro.jsp").forward(request, response);
	}

}
