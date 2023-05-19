package controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connection.DAOAcces;

/**
 * Servlet implementation class ControleurConnexion
 */
@WebServlet("/ControleurConnexion")
public class ControleurConnexion extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurConnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String login = (String)request.getParameter("login");
		String password = (String)request.getParameter("pass");
		
		if(login.equals("test") || password.equals("pass")) //Si au moins des deux champs est rempli
		{
			getServletContext().getRequestDispatcher("/accueil").forward(request, response);
		}
		else
		{
			getServletContext().getRequestDispatcher("/connexion").forward(request, response);
		}
			//ouvre la connexion si les deux champs sont remplis
//			DAOAcces dao = new DAOAcces("com.mysql.jdbc.Driver","tableurnotes","root","");
//			try {
//				Statement verifUtilisation = (Statement) dao.getConn().createStatement();
//			}
//			
//			catch {
//				
//			}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
