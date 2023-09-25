import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Formation {
    private Map<Matiere,Integer> formation;
    private int id;

    public Formation(int id){
        this.id = id;
        this.formation = new HashMap<>();
    }

    public int getId(){
        return this.id;
    }

    public void ajouter(Matiere matiere, int coeff){
        this.formation.put(matiere,coeff);
    }

    public void aupprimer(Matiere matiere){
        this.formation.remove(matiere);
    }

    public boolean contientMatiere(Matiere matiere){
        // verifier si la matiere est dans la formation
        return this.formation.containsKey(matiere);
    }

    public int getCoeff(Matiere matiere){
        // recuperer la matiere
        Object coeff = this.formation.get(matiere);
        // verifier si le coeff est null
        if(coeff == null){
            // retourner -1
            return -1;
        }else{
            // sinon retourner le coeff
            return (int) coeff;
        }
    }

    @Override
    public String toString(){
        String resultat = "Formation id "+this.id+"\n";
        // parcourir les matieres de la formation
        for(Matiere matiere : this.formation.keySet()){
            // ajouter la matiere et le coeff au resultat
            resultat += matiere.getNom()+" : "+getCoeff(matiere)+"\n";
        }
        // retourner le resultat
        return resultat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formation formation = (Formation) o;
        return id == formation.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
