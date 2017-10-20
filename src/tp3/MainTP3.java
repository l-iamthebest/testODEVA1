/**
 * 
 */
package tp3;

import java.util.EmptyStackException;
import java.util.Scanner;

import tp3.gestion.FicheSejour;
import tp3.gestion.GestionnairePatient;

/**
 * @author ladrouz
 *
 */
public class MainTP3 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Bienvenue dans le logiciel de Gestion des Patients de l'hopital Ladouille !");		
		
		Scanner input = new Scanner(System.in);
		
		
		GestionnairePatient gp = new GestionnairePatient();
		Patient moh = new Patient("Djellali","Mohamed",37,"10 rue Marcel Pagnol, Roncq 59123","37322114");
		gp.ajouterPatient(moh);
		
		System.out.println("Que voulez-vous faire ? (Tapez le numero de votre choix)");
		System.out.println("1 : entrée d'un patient");
		System.out.println("2 : visualisation d'un séjour en cours");
		System.out.println("3 : consultation");
		System.out.println("4 : sortie d'un patient");
		
		int choix = input.nextInt();
		switch(choix) {
			case 1 :
				System.out.println("Entrez le numero de securite du patient:");
				input.nextLine();
				String num_secu = input.nextLine();
				if(!(gp.containPatient(num_secu))){
					System.out.println("Entrez Nom:");
					String nom = input.nextLine();
					System.out.println("Entrez Prenom:");
					String prenom = input.nextLine();
					
					System.out.println("Entrez Adresse:");
					String adresse = input.next();
					
					System.out.println("Entrez Age:");
					int age = input.nextInt();		
					
					Patient p = new Patient(nom,prenom,age,adresse,num_secu);
					try{
						gp.ajouterPatient(p);
						System.out.println("[OK] Patient ajoute a la Base de donnees !");
						System.out.println("Veuillez ajouter les spécialités du séjour");
						String spe1 = input.next();
					}
					catch (Exception e) {
						System.out.println("Erreur: "+e);
					}
				}
				else
					throw new Exception("Erreur: Le patient existe deja !");
				
		}
	}

}
