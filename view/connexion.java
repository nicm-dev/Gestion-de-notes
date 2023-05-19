package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class connexion
 */
@WebServlet("/connexion")
public class connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public connexion() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		//ouvre la connexion
		
		//formulaire de connexion
			out.println
			("<html><head></head><body>"+
			"<h1>Ceci est un test !</h1>"+
			"<div align=center><table><form action=\"ControleurConnexion\" name = \"FormConnexion\">"+
			"<tr><td>Login</td><td><input type =\"text\" name =\"login\"></input></td></tr>"+
			"<tr><td>Mot de passe</td><td><input type =\"password\" name =\"pass\"></input></td></tr>"+
			"<tr><td colspan=2><input type =\"submit\" name =\"action\" value =\"C'est parti ! \" /></td></tr>"+
			"</form>"+
			"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		// construction d'un request dispatcher sur le chemin /process, qui doit exister
	     // dans la web application courante
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/process") ;
	    
	     // redirection de la requête vers cette ressource
	    requestDispatcher.forward(request, response) ;

	}

}
