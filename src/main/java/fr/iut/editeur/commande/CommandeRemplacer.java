package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;start;end;chaine");
            return;
        }
        String texte = parameters[3];
        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), texte);
        super.executer();
    }
}
