package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Base_Datos;
import model.Registro;

/**
 * Servlet implementation class comprobar_login
 */
@WebServlet("/comprobar_login")
public class comprobar_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public comprobar_login() {
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
		String cuenta =request.getParameter("cuenta");
		String nombre =request.getParameter("nombre");
		String contra =request.getParameter("contra");
		String email =request.getParameter("email");
		Registro leer_datos = new Registro(clave,cuenta,nombre,contra,email);
		Base_Datos n_login = new Base_Datos();
		n_login.Comprobar_Usuario(nombre, contra);
		n_login.Resultado();
		
		
		if(n_login.Resultado() != true) {
			 
			request.setAttribute("atribAlumn",n_login); 
			request.getRequestDispatcher("/No_Logeado.jsp").forward(request, response);
			
		}else {
			HttpSession session = request.getSession(); 
			session.setAttribute("nombre", nombre);
			request.setAttribute("atribAlumn",leer_datos); 
			request.getRequestDispatcher("/Logueado.jsp").forward(request, response);
			
		}
	  
		/*request.setAttribute("atribAlumn",n_login); 
		request.getRequestDispatcher("/Logueado.jsp").forward(request, response);*/
		
		
	}

}
