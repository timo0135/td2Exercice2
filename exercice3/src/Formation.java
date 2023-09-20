import java.util.HashMap;
import java.util.Map;

public class Formation {
    private Map<Matiere,Integer> formation;
    private int id;

    public Formation(int id){
        this.id = id;
        this.formation = new HashMap<>();
    }

    public void Ajouter(Matiere matiere, int coeff){
        this.formation.put(matiere,coeff);
    }

    public void Supprimer(Matiere matiere){
        this.formation.remove(matiere);
    }

    public boolean contientMatiere(Matiere matiere){
        return this.formation.containsKey(matiere);
    }

    public int getCoeff(Matiere matiere){
        Object coeff = this.formation.get(matiere);
        if(coeff == null){
            return -1;
        }else{
            return (int) coeff;
        }
    }

    @Override
    public String toString() {
        String resultat = "Formation id "+this.id+"\n";
        for(Matiere matiere : this.formation.keySet()){
            resultat += matiere.getNom()+" : "+getCoeff(matiere)+"\n";
        }
        return resultat;
    }
}
