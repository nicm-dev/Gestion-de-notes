package view; //package view

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connection.DAOAcces;
import metiers.Stagiaire;

/**
 * Servlet implementation class accueil
 */
@WebServlet("/accueil") //Nom de la servlet
public class accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accueil() {
        super();
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
			"<select name='classe'>");
	
			DAOAcces dao = new DAOAcces("com.mysql.jdbc.Driver", "tableurnotes", "root", "");
			String sql = "select * from classe;";
			try 
			{
				ResultSet rs = dao.getStatement().executeQuery(sql);
				while (rs.next()) // création d'un tableau associatif
				{
					out.println("<option value='"+rs.getInt("idClasse")+"'>"+rs.getString("nomClasse")+"</option>");
				}
			}
			catch(SQLException e)
			{
				System.out.println("Problème SQL1");
				e.printStackTrace();
			}				
			out.println("</select>"+
			"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
