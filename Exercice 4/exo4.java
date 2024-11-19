public class Zoo {
    public void nourrirAnimal(String type, String nom) {
        if(type.equals("Chien")) {
            System.out.println("Donner de la nourriture pour chien à " + nom);
            System.out.println(nom + " aboie après avoir mangé.");
        }
        else if(type.equals("Chat")) {
            System.out.println("Donner de la nourriture pour chat à " + nom);
            System.out.println(nom + " ronronne après avoir mangé.");
        }
        else if(type.equals("Oiseau")) {
            System.out.println("Donner des graines à " + nom);
            System.out.println(nom + " chante après avoir mangé.");
        }
        else {
            System.out.println("Type d'animal inconnu.");
        }
    }
}

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

/**
 * réation de la classe Chien qui hérite d'Animal
*/
public class Chien extends Animal {
    private String type;

    /**
     * création de l'objet Chien
     * 
     * @param nom nom de l'animal
     * @param age age de l'animal
     * @param type type de l'animal ici un chien
    */
    public Chien(String nom, int age) {
        super(nom, age);
        this.type = "Chien";
    }

    /**
     * procédure d'aboiment
    */
     public void parler() {
        System.out.println("Woof Woof");
     }
}

/**
 * réation de la classe Chien qui hérite d'Animal
*/
public class Chien extends Animal {
    private String type;
    /**
     * création de l'objet Chien
     * 
     * @param nom nom de l'animal
     * @param age age de l'animal
     * @param type type de l'animal ici un chat
    */
    public Chien(String nom, int age){
        super(nom, age);
        this.type = "Chat";
    }

    /**
     * procédure de miaulement
    */
     public void parler() {
        System.out.println("Miaou");
     }
}