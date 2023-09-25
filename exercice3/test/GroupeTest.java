import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupeTest {

    @Test
    void compareAlpha() {
        Formation f1 = new Formation(4);
        Groupe g1 = new Groupe(f1);
        g1.ajouterEtudiant(new Etudiant(new Identite("test","jojo","lafriture"),f1));
        g1.ajouterEtudiant(new Etudiant(new Identite("test2","jaja","labrinbelle"),f1));
        g1.ajouterEtudiant(new Etudiant(new Identite("test3","jojo","labrinbelle"),f1));
        g1.compareAlpha();
        System.out.println(g1);
    }

    @Test
    void compareAntiAlpha() {
        Formation f1 = new Formation(4);
        Groupe g1 = new Groupe(f1);
        g1.ajouterEtudiant(new Etudiant(new Identite("test","jojo","lafriture"),f1));
        g1.ajouterEtudiant(new Etudiant(new Identite("test2","jaja","labrinbelle"),f1));
        g1.ajouterEtudiant(new Etudiant(new Identite("test3","jojo","labrinbelle"),f1));
        g1.compareAntiAlpha();
        System.out.println(g1);
    }
}