import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantTest {
    @Test
    public void creationEtudiant(){
        Etudiant etudiant = new Etudiant(new Identite("2RT"),new Formation(1));
    }

    @Test
    public void ajouterNoteFormationPasMatiere(){
        Etudiant etudiant = new Etudiant(new Identite("2RT"),new Formation(1));
        etudiant.ajouterNote(new Matiere("test"),5);
    }

    @Test
    public void ajouterNoteNegative(){
        Etudiant etudiant = new Etudiant(new Identite("2RT"),new Formation(1));
        etudiant.getFormation().Ajouter(new Matiere("test"),4);
        etudiant.ajouterNote(new Matiere("test"),-5);
    }

    @Test
    public void ajouterNoteOk(){
        Etudiant etudiant = new Etudiant(new Identite("2RT"),new Formation(1));
        etudiant.getFormation().Ajouter(new Matiere("test"),4);
        etudiant.ajouterNote(new Matiere("test"),5);
    }

    @Test
}