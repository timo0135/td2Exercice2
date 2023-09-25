import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Etudiant implements Comparable<Etudiant>{

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
		// verifier si la matiere est dans la formation et que la note est entre 0 et 20
		if (!formation.contientMatiere(matiere) || note < 0 || note > 20) {
			// si non, lever une exception
			throw new IllegalArgumentException("Matière non valide ou note invalide.");
		}
		// ajouter la note
		notes.put(matiere, note);
	}

	public double calculerMoyenneMatiere(Matiere matiere) {
		// verifier si la matiere est dans la formation
		if (!formation.contientMatiere(matiere)) {
			// si non, lever une exception
			throw new IllegalArgumentException("Matière non valide.");
		}
		Double note = notes.get(matiere);
		// retourner la note ou 0 si la note est null
		return note != null ? note : 0.0;
	}

	public double calculerMoyGen(){
		double somme = 0;
		int nbmatiere = 0;
		// parcourir les matieres de la formation
		for(Matiere key: this.notes.keySet()){
			// ajouter la note de la matiere a la somme
			somme += this.notes.get(key) * this.formation.getCoeff(key);
			// incrementer le nombre de matiere
			nbmatiere++;
		}
		// retourner la moyenne
		return somme/nbmatiere;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Etudiant etudiant = (Etudiant) o;
		return Objects.equals(identite, etudiant.identite);
	}

	@Override
	public int hashCode() {
		return Objects.hash(identite);
	}

	@Override
	public int compareTo(Etudiant o) {
		if(o.getIdentite().getNom().compareTo(this.identite.getNom())==0){
			return -o.getIdentite().getPrenom().compareTo(this.identite.getPrenom());
		}else{
			return -o.getIdentite().getNom().compareTo(this.identite.getNom());
		}
	}

}
