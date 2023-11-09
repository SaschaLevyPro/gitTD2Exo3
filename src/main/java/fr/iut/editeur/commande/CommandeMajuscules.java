package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
public class CommandeMajuscules extends CommandeDocument{

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;start;end");
            return;
        }
        String texte = parameters[2];
        this.document.majuscules(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("Majuscules");
    }
}
