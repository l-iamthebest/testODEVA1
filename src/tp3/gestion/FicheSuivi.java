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
public class FicheSuivi {

	private Specialite spe;
	private ArrayList<CompteRendu> cr;
	
	public FicheSuivi(Specialite spe) {
		this.spe = spe;
		this.cr = new ArrayList<CompteRendu>();
	}

	/**
	 * @return the spe
	 */
	public Specialite getSpe() {
		return spe;
	}

	/**
	 * @param spe the spe to set
	 */
	public void setSpe(Specialite spe) {
		this.spe = spe;
	}

	/**
	 * @return the cr
	 */
	public ArrayList<CompteRendu> getCr() {
		return cr;
	}
	
	/**
	 * Ajoute un compte rendu a la fiche de suivi
	 * @param cr <code>CompteRendu</code>, represente le compte rendu a ajouter
	 */
	public void ajouterCompteRendu(CompteRendu cr) {
		this.cr.add(cr);
	}
}
