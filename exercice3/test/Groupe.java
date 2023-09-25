import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Groupe {

    List<Etudiant> classe = new ArrayList<>();
    Formation formation;

    public void Groupe(Formation formation){
        this.formation = formation;
    }

    public void ajouterEtudiant(Etudiant etu){
        if(etu.getFormation().equals(this.formation)){
            classe.add(etu);
        }
    }

    public void supprimerEtudiant(Etudiant etu){
        classe.remove(etu);
    }
}
