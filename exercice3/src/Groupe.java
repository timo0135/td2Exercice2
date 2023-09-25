import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Groupe {

    List<Etudiant> classe = new ArrayList<>();
    Formation formation;

    public Groupe(Formation formation){
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

    public double calculerMoyenneMatiere(Matiere matiere){
        double somme = 0;
        int nbetu = 0;
        for(Etudiant etu : classe){
            somme += etu.calculerMoyenneMatiere(matiere);
            nbetu++;
        }
        return somme/nbetu;
    }

    public double calculerMoyGen(){
        double somme = 0;
        int nbetu = 0;
        for(Etudiant etu : classe){
            somme += etu.calculerMoyGen();
            nbetu++;
        }
        return somme/nbetu;
    }


}
