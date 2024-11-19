public class Veterinaire {
    public void soignerAnimal(String type, String nom) {
        if(type.equals("Chien")) {
            soignerChien();
            examenPattes();
            vaccin();
        }
        else if(type.equals("Chat")) {
            soignerChat();
            examenGriffes();
            nettoyageOreilles();
        }
    }

    /***
     * procédure du soin des chiens
    */
    private void soignerChien() {
        System.out.println("Soins pour le chien " + nom);
    }

    /***
     * procédure d'axamen des pattes
    */
    private void examenPattes() {
        System.out.println("Examen des pattes");
    }

    /**
     * procédure d'injection de vaccin
    */
    private void vaccin() {
        System.out.println("Injection de vaccin");
    }
    
    /**
     * procédure du soin des chats
    */
    private void soignerChat() {
        System.out.println("Soins pour le chat " + nom);
    }

    /**
     * procédure d'examen des Griffes
    */
    private void examenGriffes() {
        System.out.println("Examen des griffes");
    }

    /**
     * procédure du nettoyage des oreilles
    */
     private nettoyageOreilles() {
        System.out.println("Nettoyage des oreilles");
     }
}