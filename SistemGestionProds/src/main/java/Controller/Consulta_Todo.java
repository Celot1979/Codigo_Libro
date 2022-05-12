package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BBDD;
import Model.Producto;

/**
 * Servlet implementation class Consulta_Todo
 */
@WebServlet("/Consulta_Todo")
public class Consulta_Todo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consulta_Todo() {
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
		ArrayList <Producto> productos = new ArrayList<Producto>();
		Producto producto;
		BBDD nuevo = new BBDD();
		productos= nuevo.leerTodo();
		
		if(productos != null) {
			request.setAttribute("Productos",productos);
			request.getRequestDispatcher("/Consulta_Todos.jsp").forward(request, response);
			
		}else {
			request.getRequestDispatcher("/noHayRegistros.jsp").forward(request, response);
		}
	}

}
