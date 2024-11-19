/**
 * Création de la class Animal avec ses procédures , fonction et varriables
*/
public class Animal {
	public String nom;
	public int age;

	/**
	 * création d'un objet Animal
	 * 
	 * @param nom nom de l'animal
	 * @param age age de l'animal
	*/
	public Animal(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	/**
	 * procédure qui affiche à la console "Je suis un animal."
	*/
	public void parler() {
		System.out.println("Je suis un animal.");
	}
	
	/**
	 * prcédure qui affiche les infos de l'animal
	*/
	public void afficherInfo() {
		System.out.println("Nom: "+nom+", Âge: "+age+" ans");
	}
}