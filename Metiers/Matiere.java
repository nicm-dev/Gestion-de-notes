package metiers;

import java.util.ArrayList; // import the ArrayList class




public class Matiere {
	
	private int id;
	private String nom;
	private ArrayList<Examen> Examens; // Liste des examens
	public static int nbMatieres = 0;
	
	
	public Matiere (int id, String nom, ArrayList<String> Examens)//constructeur Matière
	{
		this.id = id;
		this.nom = nom;
		this.Examens = new ArrayList<Examen>();
	}



public String toString()
{
	return (this.getEtudiant());
}

public static void main(String[] args) {
	

}

}
