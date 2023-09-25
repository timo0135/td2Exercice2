public class Identite {
	private final String NIP;
	private String nom;
	private String prenom;


	public Identite(String nip, String nom, String prenom) {
		this.NIP = nip;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNIP() {
		return NIP;
	}

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
}