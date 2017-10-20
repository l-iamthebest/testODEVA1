/**
 * 
 */
package tp3.gestion;

import java.util.Date;

import tp3.medecin.Specialite;

/**
 * Cette classe represente un CompteRendu
 * @see Specialite
 * @author Liam Ladrouz
 * @author Abbas Attaf
 */
public class CompteRendu {
	private Date date;
	private Specialite spe;
	private String corps;
	
	public CompteRendu(Specialite spe) {
		this.spe = spe;
		this.date = new Date();
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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
	 * @return the corps
	 */
	public String getCorps() {
		return corps;
	}

	/**
	 * @param corps the corps to set
	 */
	public void setCorps(String corps) {
		this.corps = corps;
	}
	
}
