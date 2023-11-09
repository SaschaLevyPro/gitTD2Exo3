package fr.iut.editeur.document;

public class Document {

<<<<<<< src/main/java/fr/iut/editeur/document/Document.java
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
=======
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
>>>>>>> src/main/java/fr/iut/editeur/document/Document.java
    }

    @Override
    public String toString() {
<<<<<<< src/main/java/fr/iut/editeur/document/Document.java
        return this.texteDocument;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        remplacer(start, end, texteDocument.substring(start, end).toUpperCase());
    }
    public void minuscules(int start, int end) {remplacer(start, end, texteDocument.substring(start, end).toLowerCase());}
=======
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
>>>>>>> src/main/java/fr/iut/editeur/document/Document.java
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }
    public void clear() {
<<<<<<< src/main/java/fr/iut/editeur/document/Document.java
        texteDocument = "";
    }
    public void inserer(int position, String texte) {
        String leftPart = this.texteDocument.substring(0, position);
        String rightPart = this.texteDocument.substring(position);
        this.texteDocument = leftPart + texte + rightPart;
=======
        contentDocument = "";
    }
    public void inserer(int position, String texte) {
        String leftPart = this.contentDocument.substring(0, position);
        String rightPart = this.contentDocument.substring(position);
        this.contentDocument = leftPart + texte + rightPart;
>>>>>>> src/main/java/fr/iut/editeur/document/Document.java
    }

}
