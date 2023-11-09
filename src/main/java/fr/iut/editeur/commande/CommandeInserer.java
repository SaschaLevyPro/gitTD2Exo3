package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;position;texte");
            return;
        }
        int position = Integer.parseInt(parameters[1]);
        position++;
        String texte = parameters[2];
        this.document.inserer(position, texte);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("Inserer");
    }

}
