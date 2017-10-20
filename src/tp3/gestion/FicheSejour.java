/**
 * 
 */
package tp3.gestion;

import java.util.ArrayList;

import tp3.medecin.Specialite;

/**
 * @author ladrouz
 *
 */
public class FicheSejour {
	private ArrayList<Specialite> speList;
	
	public FicheSejour() {
		this.speList = new ArrayList<Specialite>();
	}

	/**
	 * @return the speList
	 */
	public ArrayList<Specialite> getSpeList() {
		return speList;
	}
	
	/**
	 * Ajoute une specialite a la liste des specialite de cette fiche
	 * @param spe <code>Specialite</code>, represente la specialite
	 */
	public void ajouterSpecialite(Specialite spe) {
		this.speList.add(spe); // Ne devrions nous pas verifier qu'une spe ne peut etre presente 1 seule fois seulement ?
	}
}
