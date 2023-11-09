package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
public class CommandeMinuscules extends CommandeDocument{

    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : Minuscules;start;end");
            return;
        }
        String texte = parameters[2];
        this.document.minuscules(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("Minuscules");
    }

}
