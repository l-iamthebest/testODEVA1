/**
 * 
 */
package tp3.gestion;

import java.util.ArrayList;

import tp3.Patient;

/**
 * @author ladrouz
 *
 */
public class GestionnairePatient {
	private ArrayList<Patient> patientList;
	
	public GestionnairePatient(){
		this.patientList = new ArrayList<Patient>();
	}
	
	public boolean containPatient(String num){
		for (Patient patient : patientList) {
			if(patient.getNumeroSecurite().equals(num))
				return true;
		}
		return false;
	}
	
	public void ajouterPatient(Patient p){
		if(!(this.patientList.contains(p))){
			this.patientList.add(p);
		}
		else
			System.out.println("Erreur: Le patient existe deja dans la base !");
	}
	
	public void supprimerPatient(Patient p) {
		if(this.patientList.contains(p)){
			this.patientList.remove(p);
		}
	}
	
	public Patient getPatient(String num){
		Patient mp = null;
		if(this.containPatient(num)){
			for (Patient patient : patientList) {
				if(patient.getNumeroSecurite().equals(num))
					mp =  patient;
			}
		}
		else
			System.out.println("Erreur: Le patient n'existe pas !");
		return mp;
	}
}
