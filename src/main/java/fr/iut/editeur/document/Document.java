package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = contentDocument.substring(0, start);
        String rightPart = contentDocument.substring(end);
        contentDocument = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        remplacer(start, end, contentDocument.substring(start, end).toUpperCase());
    }
    public void minuscules(int start, int end) {remplacer(start, end, contentDocument.substring(start, end).toLowerCase());}
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }
    public void clear() {
        contentDocument = "";
    }
    public void inserer(int position, String texte) {
        String leftPart = this.contentDocument.substring(0, position);
        String rightPart = this.contentDocument.substring(position);
        this.contentDocument = leftPart + texte + rightPart;
    }

}
