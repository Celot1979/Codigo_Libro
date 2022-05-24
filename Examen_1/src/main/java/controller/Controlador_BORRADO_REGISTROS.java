package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Registro;

/**
 * Servlet implementation class Controlador_BORRADO_REGISTROS
 */
@WebServlet("/Controlador_BORRADO_REGISTROS")
public class Controlador_BORRADO_REGISTROS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador_BORRADO_REGISTROS() {
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
		
		
		/*Registro borrado = new Registro(clave,cuenta);
		borrado.borrar(clave,cuenta);
		
		
		if(borrado.borrar(clave,cuenta) != true) {
			//request.getRequestDispatcher("/No_Conectado.jsp").forward(request, response);
		}else {
			request.setAttribute("atribAlumn",borrado); 
			request.getRequestDispatcher("/Vista_Borrado.jsp").forward(request, response);
			System.out.println("Ha llegado hasta controlador_Borrado_Registros, método borrar");
			
		}*/
		
	}

}
