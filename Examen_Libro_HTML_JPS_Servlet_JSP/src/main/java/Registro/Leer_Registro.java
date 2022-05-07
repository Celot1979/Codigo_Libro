package Registro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Registro.Leer;
import Guardar.Archivos;
import java.util.ArrayList;
/**
 * Servlet implementation class Leer_Registro
 */
@WebServlet("/Leer_Registro")
public class Leer_Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Leer_Registro() {
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
		PrintWriter out = response.getWriter();
		try {
			 ArrayList <Archivos> productos = new ArrayList <Archivos> ();
			 int cont=0;
			 String contador;
			 Archivos archivo;
			 Leer.clearCont();
			
			 productos = Leer.leeProductos();
			 cont = Leer.getCont();
			 contador= String.valueOf(cont);
			 request.setAttribute("Productos",productos);
			 request.setAttribute("contador", contador);
			 request.getRequestDispatcher("/Vista_Total_Productos.jsp").forward(request, response);
			
		}finally {
			
		}
		

}
}
