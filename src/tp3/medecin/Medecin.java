package tp3.medecin;

/**
 * Cette classe represente un medecin quelconque à qui nous allons attribuer une specialite.
 * @see Specialite
 * @author Liam Ladrouz
 * @author Abbas Attaf
 */

public class Medecin extends Specialite{
	
	/**
	 * Nom du medecin.
	 */
	protected String nom;
	
	/**
	 * Prenom du medecin.
	 */
	protected String prenom;
	
	/**
	 * Specialite du medecin.
	 */
	protected String specialite;
	
	public Medecin(String nom, String prenom, String spe){
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = spe;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return this.specialite;
	}
	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	
}
