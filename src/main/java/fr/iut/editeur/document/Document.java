package fr.iut.editeur.document;
/** Classe qui represente un document modifiable par l'utilisateur en direct
 * */
public class Document {

/** Attribut qui represente le texte du document */
    private String texteDocument;
    public Document() {
        this.texteDocument = "";
    }

    public String getTexte() {
        return texteDocument;
    }

    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public String gettexteDocument() {
        return texteDocument;
    }

    public void settexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }


    @Override
    public String toString() {
        return this.texteDocument;
    }
/** Methode qui permet de remplacer une partie de texte dans le document
 * classe liée : {@link fr.iut.editeur.commande.CommandeRemplacer}
 * @param start la position de debut du remplacement
 *              @param end la position de fin du remplacement
 *                         @param remplacement le texte qui va remplacer l'ancien texte
 * */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }

    /** Methode qui permet de mettre en majuscule une partie de texte dans le document
     * classe liée : {@link fr.iut.editeur.commande.CommandeMajuscules}
     * @param start la position de debut de la mise en majuscule
     * @param end la position de fin de la mise en majuscule*/
    public void majuscules(int start, int end) {
        remplacer(start, end, texteDocument.substring(start, end).toUpperCase());
    }

    /** Methode qui permet de mettre en minuscule une partie de texte dans le document
     * classe liée : {@link fr.iut.editeur.commande.CommandeMinuscules}
     * @param start la position de debut de la mise en minuscule
     * @param end la position de fin de la mise en minuscule*/
    public void minuscules(int start, int end) {
        remplacer(start, end, texteDocument.substring(start, end).toLowerCase());
    }
    /** Methode qui permet de supprimer une partie de texte dans le document
     * classe liée : {@link fr.iut.editeur.commande.CommandeEffacer}
     * @param start la position de debut de la suppression
     * @param end la position de fin de la suppression*/
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }
/** Methode qui permet de supprimer tout le texte du document
 */

    public void clear() {
        texteDocument = "";
    }

    /**
     * Methode qui permet d'inserer un texte dans le document
     * classe liée : {@link fr.iut.editeur.commande.CommandeInserer}
     * @param position la position ou l'on va inserer
     * @param texte le texte que l'on va inserer*/
    public void inserer(int position, String texte) {
        String leftPart = this.texteDocument.substring(0, position);
        String rightPart = this.texteDocument.substring(position);
        this.texteDocument = leftPart + texte + rightPart;
    }

}
