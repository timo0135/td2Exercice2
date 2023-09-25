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
	@Test
	void calculerMoyenneMatiere() {
		// test de la méthode calculerMoyenneMatiere
		// créer une formation
		Formation form = new Formation(1);
		// créer une matiere
		Matiere mat = new Matiere("Maths");
		// ajouter la matiere a la formation
		form.ajouter(mat,1);
		// créer un groupe
		Groupe groupe = new Groupe(form);
        // créer un etudiant
		Identite id = new Identite("FHYFYYF","truc", "machin");
		Etudiant etu = new Etudiant(id,form);
		// ajouter l'etudiant au groupe
		groupe.ajouterEtudiant(etu);
		// ajouter une note a l'etudiant
		etu.ajouterNote(mat,10);
		// vérifier que la moyenne de l'etudiant est 10
		assertEquals(10,groupe.calculerMoyenneMatiere(mat));
		// ajouter un deuxieme etudiant au groupe
		Identite id2 = new Identite("FHYFYY1", "bidule", "chose");
		Etudiant etu2 = new Etudiant(id2,form);
		// ajouter l'etudiant au groupe
		groupe.ajouterEtudiant(etu2);
		// ajouter une note a l'etudiant
		etu2.ajouterNote(mat,20);
		// vérifier que la moyenne de l'etudiant est 15
		assertEquals(15,groupe.calculerMoyenneMatiere(mat));
	}

	@Test
	void calculerMoyGen() {
		// test de la méthode calculerMoyenneGen
		// créer une formation
		Formation form = new Formation(1);
		// créer une matiere
		Matiere mat = new Matiere("Maths");
		// ajouter la matiere a la formation
		form.ajouter(mat,1);
		// créer un groupe
		Groupe groupe = new Groupe(form);
		// créer un etudiant
		Identite id = new Identite("FHYFYYF","truc", "machin");
		Etudiant etu = new Etudiant(id,form);
		// ajouter l'etudiant au groupe
		groupe.ajouterEtudiant(etu);
		// ajouter une note a l'etudiant
		etu.ajouterNote(mat,10);
		// vérifier que la moyenne de l'etudiant est 10
		assertEquals(10,groupe.calculerMoyGen());
		// ajouter un deuxieme etudiant au groupe
		Identite id2 = new Identite("FHYFYY1", "bidule", "chose");
		Etudiant etu2 = new Etudiant(id2,form);
		// ajouter l'etudiant au groupe
		groupe.ajouterEtudiant(etu2);
		// ajouter une note a l'etudiant
		etu2.ajouterNote(mat,20);
		// vérifier que la moyenne de l'etudiant est 15
		assertEquals(15,groupe.calculerMoyGen());
	}
}