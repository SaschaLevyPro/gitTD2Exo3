package fr.iut.editeur.document;

public class DocumentTest extends junit.framework.TestCase{
    public void testAjouter() throws Exception {
        Document document = new Document();
        document.ajouter("Bonjour");
        assertEquals("Bonjour", document.toString());
    }
    public void testClear() throws Exception {
        Document document = new Document();
        document.ajouter("Bonjour");
        document.clear();
        assertEquals("", document.toString());
    }
    public void testRemplacer() throws Exception {
        Document document = new Document();
        document.ajouter("Bonjour");
        document.remplacer(0, 3, "Bonsoir");
        assertEquals("Bonsoirjour", document.toString());
    }
    public void testMajuscules() throws Exception {
        Document document = new Document();
        document.ajouter("Bonjour");
        document.majuscules(0, 3);
        assertEquals("BONjour", document.toString());
    }
    public void testEffacer() throws Exception {
        Document document = new Document();
        document.ajouter("Bonjour");
        document.effacer(0, 3);
        assertEquals("jour", document.toString());
    }
    public void testInserer() throws Exception {
        Document document = new Document();
        document.ajouter("Bonjour");
        document.inserer(3, "soir");
        assertEquals("Bonsoirjour", document.toString());
    }

    public void testMinuscules() throws Exception {
        Document document = new Document();
        document.ajouter("BONJOUR");
        document.minuscules(0, 3);
        assertEquals("bonJOUR", document.toString());
    }
}
