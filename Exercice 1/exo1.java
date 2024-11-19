/**
 * Création de la class Animal avec ses procédures , fonction et varriables
 * **/
public class Animal{
	public String nom;
	public int age;
	
	/**
	 * procédure qui affiche à la console "Je suis un animal."
	 * **/
	public void parler(){
		System.out.println("Je suis un animal.");
	}
	
	/**
	 * prcédure qui affiche les infos de l'animal
	 * **/
	public void afficherInfo(){
		System.out.println("Nom: "+nom+", Âge: "+age+" ans");
	}
}