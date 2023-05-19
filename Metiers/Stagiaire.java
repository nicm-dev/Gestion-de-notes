package metiers;//package Metiers

import java.util.ArrayList; // import the ArrayList class

public class Stagiaire {
	private int id; // id
	private String nom; // nom
	private String prenom; // prenom
	private ArrayList<Float> listeNotes;  // Liste des notes

	private Classe classe;
	
	public Stagiaire (int id, String nom, String prenom, Classe classe)//constructeur Stagiaire
	{
		this.id = id; // acc�der � l'id
		this.nom = nom; // acc�der au nom
		this.prenom = prenom; // acc�der au pr�nom
		this.listeNotes  = new ArrayList<Float>(); // cr�ation de la liste de notes
		this.classe = classe;
	}

	
	//getter et setter id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//getter et setter nom
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	//getter et setter prenom
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	//getter et setter liste Notes
	public ArrayList<Float> getListeNotes() {
		return listeNotes;
	}

	public void setListeNotes(ArrayList<Float> listeNotes) {
		this.listeNotes = listeNotes;
	}
	//getter et setter classe
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	
	//m�thode to string
	public String toString()
	{
		return (this.get());
	}
	
	public static void main(String[] args) {
		

	}

}
