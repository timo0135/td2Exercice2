import java.util.HashMap;
import java.util.Map;

public class Formation {
    private Map<Matiere,Integer> forma;
    private int id;

    public Formation(int id){
        this.id = id;
        this.forma = new HashMap<>();
    }

    public void Ajouter(Matiere matiere, int coeff){
        this.forma.put(matiere,coeff);
    }

    public void Supprimer(Matiere matiere){
        this.forma.remove(matiere);
    }

    public int getCoeff(Matiere matiere){
        Object coeff = this.forma.get(matiere);
        if(coeff == null){
            return -1;
        }else{
            return (int) coeff;
        }
    }

    @Override
    public String toString() {
        String resultat = "Formation id "+this.id+"\n";
        for(Matiere matiere : this.forma.keySet()){
            resultat += matiere.getNom()+" : "+getCoeff(matiere)+"\n";
        }
        return resultat;
    }
}
