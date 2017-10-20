package tp3.medecin;

/**
 * Cette classe abstraite represente la specialite d'un medecin
 * @author Liam Ladrouz
 * @author Abbas Attaf
 */

public abstract class Specialite {

	/** 
	 * Nom de la specialite
	 */
	protected String nom;
	
	protected String prenom;
	
	protected String spe;

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
	 * @return the spe
	 */
	public String getSpe() {
		return spe;
	}

	/**
	 * @param spe the spe to set
	 */
	public void setSpe(String spe) {
		this.spe = spe;
	}
	
	
}
