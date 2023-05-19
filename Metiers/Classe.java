package metiers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connection.DAOAcces;

public class Classe 
{
	int id;
	private String nom;
	private ArrayList<Matiere> listeMatieres;
	private ArrayList<Stagiaire> listeStagiaires;
	private ArrayList<Examen> listeExamens;
	private ArrayList<Float> moyenneMatieres;
	public static int nbClasses = 0;
	
	
	public Classe(String nom)
	{
		nbClasses++;
		this.id = nbClasses;
		this.nom = nom;
		this.listeMatieres = new ArrayList<Matiere>();
		this.listeStagiaires = new ArrayList<Stagiaire>();
		this.listeExamens = new ArrayList<Examen>();
		this.moyenneMatieres = new ArrayList<Float>();
	
		
		DAOAcces dao = new DAOAcces("com.mysql.jdbc.Driver", "tableurnotes", "root", ""); //récupération de l'état de la connexion à la BDD
		
		//1ere requête String sql ="select * from classe where idClasse="+c1.getId()+"";
		//1ere requête : récupérer les données de la classe c1
		
		String sql = "select * from stagiaire where classe = "+this.id+";";
		try 
		{
			ResultSet rs = dao.getStatement().executeQuery(sql);
			while (rs.next()) // création d'un tableau associatif
			{
				this.ajoutStagiaire(new Stagiaire(id, rs.getString("nom"), rs.getString("prenom"), this));
			}
		}
		catch(SQLException e) 
		{
			System.out.println("Problème SQL.");
			e.printStackTrace();
		}			
	}
	
//		//2eme requete String sql1 ="select * from stagiaire where classeStagiaire ="+c1.getId()+"";
//		//2eme requete : recuperer les données des stagiaires
//	
//		String sql1 = "select * from stagiaire where classeStagiaire = "+c1.getId+";";
//		try 
//		{
//			ResultSet rs1 = dao.getStatement().executeQuery(sql1);
//			while (rs1.next()) 
//			{
//				c1.nom = (String) rs1.getString("nomClasse");
//			}
//		}
//	
//		catch(SQLException e) 
//		{
//			System.out.println("Problème SQL b!!");
//			e.printStackTrace();
//		}
//	}
	
		//3eme requete String sql2 ="select distinct idMatiere, nomMatiere from matiere, examen;";
		//3eme requete : recuperer en eliminant les doublons les matieres
	
//		try 
		

		{
//			ResultSet rs2 = dao.getStatement().executeQuery(sql2);
//			while (rs2.next()) 
//			{
//				c1.nom = (String) rs.getString("nomClasse");
//			}
//		}
//	
//		catch(SQLException e) 
//		{
//			System.out.println("Problème SQL b!!");
//			e.printStackTrace();
//		}
//	ResultSet rs2 = dao.getStatement().executeQuery(sql2);
//	
//	while (rs2.next(){
//		this.ajouterStagiaire(new Stagiaire);
//	}
//	
//			//4eme requete String sql3 ="select * from examen where classeExamen ="+c1.getId()+";";
			//4eme requete : recuperer les données de examen
//	try {
//		ResultSet rs3 = dao.getStatement().executeQuery(sql3);
//		
//		while (rs3.next()) {
//			.nom = (String) rs.getString("nomClasse");
//		}
//	}
//	
//	catch(SQLException e) {
//		System.out.println("Problème SQL b!!");
//		e.printStackTrace();
//	}
//	ResultSet rs3 = dao.getStatement().executeQuery(sql2);
//	
//	while (rs3.next(){
//		this.ajouterStagiaire(new Stagiaire);
//	}
//}

}

	//getters et setters : accesseurs
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public ArrayList<Matiere> getListeMatieres() {
		return listeMatieres;
	}


	public void setListeMatieres(ArrayList<Matiere> listeMatieres) {
		this.listeMatieres = listeMatieres;
	}


	public ArrayList<Stagiaire> getListeStagiaires() {
		return listeStagiaires;
	}


	public void setListeStagiaires(ArrayList<Stagiaire> listeStagiaires) {
		this.listeStagiaires = listeStagiaires;
	}


	public ArrayList<Examen> getListeExamens() {
		return listeExamens;
	}


	public void setListeExamens(ArrayList<Examen> listeExamens) {
		this.listeExamens = listeExamens;
	}


	public ArrayList<Float> getMoyenneMatieres() {
		return moyenneMatieres;
	}


	public void setMoyenneMatieres(ArrayList<Float> moyenneMatieres) {
		this.moyenneMatieres = moyenneMatieres;
	}


	public static int getNbClasses() {
		return nbClasses;
	}


	public static void setNbClasses(int nbClasses) {
		Classe.nbClasses = nbClasses;
	}
	
	private void ajoutStagiaire(Stagiaire stagiaire) {
		this.listeStagiaires.add(stagiaire);	
	}

		//portée principale
		public static void main(String[] args) {
			
			Classe c1=new Classe("bts sio slam 2018");// instanciation de c1
			Classe c2=new Classe("bts sio slam 2019");// instanciation de c2
			System.out.println(c1.getNom());//afficher le nom de c1
			System.out.println(c2.getNom());//afficher le nom de c2	
		}
	}

			