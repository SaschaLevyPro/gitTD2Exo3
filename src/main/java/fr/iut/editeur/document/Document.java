package fr.iut.editeur.document;

public class Document {

    private String texteDocument;
    private String contentDocument;

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

    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }


    @Override
    public String toString() {
        return this.texteDocument;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = contentDocument.substring(0, start);
        String rightPart = contentDocument.substring(end);
        contentDocument = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        remplacer(start, end, contentDocument.substring(start, end).toUpperCase());
    }

    public void minuscules(int start, int end) {
        remplacer(start, end, contentDocument.substring(start, end).toLowerCase());
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    public void clear() {
        texteDocument = "";
    }

    public void inserer(int position, String texte) {
        String leftPart = this.texteDocument.substring(0, position);
        String rightPart = this.texteDocument.substring(position);
        this.texteDocument = leftPart + texte + rightPart;
        contentDocument = "";
    }

}
