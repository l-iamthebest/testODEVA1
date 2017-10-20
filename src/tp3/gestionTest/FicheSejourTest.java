/**
 * 
 */
package tp3.gestionTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import tp3.gestion.FicheSejour;
import tp3.medecin.*;

/**
 * @author liamladrouz
 *
 */
public class FicheSejourTest {

	@Test
	public void fiche() {
		FicheSejour fs = new FicheSejour();
		assertNotNull(fs);
	}
	
	@Test
	public void testSpe() {
		Medecin med = new Medecin("Attaf","Abbas","Medecin de Garde");
		Dentaire dent = new Dentaire("Ladrouz","Liam","Dentiste");
		FicheSejour fs = new FicheSejour();
		fs.ajouterSpecialite(med);
		fs.ajouterSpecialite(dent);
		ArrayList<Specialite> s = new ArrayList<Specialite>();
		s.add(med);
		s.add(dent);
		assertEquals(s, fs.getSpeList());
	}

}
