import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etudiant {

	private Map<Matiere,Double> notes;
	private Identite identite;
	private Formation formation;

	public Etudiant(Identite id, Formation form){
		this.notes = new HashMap<>();
		this.formation = form;
		this.identite = id;
	}

	public Identite getIdentite() {
		return identite;
	}

	public Formation getFormation() {
		return formation;
	}

	public void ajouterNote(Matiere matiere, double note) {
		if (!formation.contientMatiere(matiere) || note < 0 || note > 20) {
			throw new IllegalArgumentException("Matière non valide ou note invalide.");
		}
		notes.put(matiere, note);
	}

	public double calculerMoyenneMatiere(Matiere matiere) {
		if (!formation.contientMatiere(matiere)) {
			throw new IllegalArgumentException("Matière non valide.");
		}
		Double note = notes.get(matiere);
		return note != null ? note : 0.0;
	}

	public double calculerMoyGen(){
		double somme = 0;
		int nbmatiere = 0;
		for(Matiere key: this.notes.keySet()){
			somme += this.notes.get(key) * this.formation.getCoeff(key);
			nbmatiere++;
		}
		return somme/nbmatiere;
	}
}
