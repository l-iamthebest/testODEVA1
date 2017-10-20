/**
 * 
 */
package tp3;

import java.util.ArrayList;

import tp3.gestion.*;
import tp3.medecin.Specialite;

/**
 * Cette classe represente un patient.
 * @see Specialite
 * @see FicheSuivi
 * @see FicheSejour
 * @author Liam Ladrouz
 * @author Abbas Attaf
 */

public  class Patient {

	private String nom;
	private String prenom;
	private String adresse;
	private String numeroSecurite;
	private int age;
	private ArrayList<FicheSuivi> fsuivi;
	private FicheSejour fsejour;
	
	public Patient(String nom, String prenom, int age, String adresse, String numeroSec) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
		this.numeroSecurite = numeroSec;
		this.fsuivi = new ArrayList<FicheSuivi>();
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
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the numeroSecurite
	 */
	public String getNumeroSecurite() {
		return numeroSecurite;
	}

	/**
	 * @param numeroSecurite the numeroSecurite to set
	 */
	public void setNumeroSecurite(String numeroSecurite) {
		this.numeroSecurite = numeroSecurite;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the fsejour
	 */
	public FicheSejour getFsejour() {
		return fsejour;
	}

	/**
	 * @param fsejour the fsejour to set
	 */
	public void setFsejour(FicheSejour fsejour) {
		this.fsejour = fsejour;
	}

	/**
	 * @return the fsuivi
	 */
	public ArrayList<FicheSuivi> getFsuivi() {
		return fsuivi;
	}
	
	/**
	 * Ajoute une fiche de suivi à l'historique du patient.
	 * @param fs, <code>FicheSuivi</code> représente une fiche de suivi
	 */
	public void ajouterFicheSuivi(FicheSuivi fs) {
		this.fsuivi.add(fs);
	}
}
