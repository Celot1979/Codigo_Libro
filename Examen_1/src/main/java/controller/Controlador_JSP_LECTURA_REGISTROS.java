package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 * Servlet implementation class Controlador_JSP_LECTURA_REGISTROS
 */
@WebServlet("/Controlador_JSP_LECTURA_REGISTROS")
public class Controlador_JSP_LECTURA_REGISTROS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador_JSP_LECTURA_REGISTROS() {
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
		try {
			ArrayList <Registro> reg = new ArrayList<Registro>();
			Base_Datos nuevo = new Base_Datos();
			reg = nuevo.leeTodos();
			if(reg != null) {
				
				request.setAttribute("Registros",reg);
				request.getRequestDispatcher("/Vista_Registrados.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("/Vista_No_Hay_Registrados.jsp").forward(request, response);
			}
		}finally {
			System.out.close();
		}
		
		/*request.setAttribute("atribAlumn",n_registro); 
		request.getRequestDispatcher("/Logueado.jsp").forward(request, response);*/
	}

}
