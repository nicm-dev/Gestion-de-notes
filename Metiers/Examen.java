package metiers;

import java.util.ArrayList; // import the ArrayList class




public class Examen {
	
	private int id;
	private String date;
	private String sujet;
	private ArrayList<Integer> listeNotes; // Liste des notes
	private String matiere;
	private String classe;
	
	public Examen ()//constructeur Examen
	{
		this.id = id;
		this.date = date;
		this.sujet = sujet;
		this.listeNotes =  new ArrayList<Integer>();
		this.matiere = matiere;
		this.classe = classe;
	}
	
	public void ajoutNote(int n)//Méthode AjoutNote
	{ 
		this.listeNotes.add(n);//insertion d'une note
	}
	
	public void calculMoyenne()
	{
		
	}
	
	//getter et setter id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//getter et setter date
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	//getter et setter sujet
	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	//getter et setter classe
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	//méthode toString()
	public String toString()
	{
		return (this.getId());
	}
	
	//portée principale
	public static void main(String[] args) {
		Examen e1=new Examen();//instanciation de e1
		Examen e2=new Examen();//instanciation de e2
		
		listeNotes.add("12");
	    listeNotes.add("15");
	    listeNotes.add("6");
	    listeNotes.add("8");
	    System.out.println(listeNotes);
		
		e2.dateConvertUS("07-11-19");//Convertion de la date fr en date US
		e2.dateToConvert("07-11-19");//Conversion de la date fr en date US
		
		v2.setEtudiant("ewen");//le nom de l'étudiant est ewen par le setter
		
		System.out.println(v2);//Affichage de v2
		

	}

}
