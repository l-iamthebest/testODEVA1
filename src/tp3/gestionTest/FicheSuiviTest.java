package tp3.gestionTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import tp3.gestion.CompteRendu;
import tp3.gestion.FicheSuivi;
import tp3.medecin.Dentaire;

public class FicheSuiviTest {

	@Test
	public void ficheSuivi() {
		Dentaire dent = new Dentaire("Ladrouz","Liam","Dentiste");
		FicheSuivi fs = new FicheSuivi(dent);
		assertNotNull(fs);
	}
	
	@Test
	public void testSpe() {
		Dentaire dent = new Dentaire("Ladrouz","Liam","Dentiste");
		FicheSuivi fs = new FicheSuivi(null);
		fs.setSpe(dent);
		assertEquals(dent, fs.getSpe());
	}
	
	@Test
	public void testCompteRendu() {
		Dentaire dent = new Dentaire("Ladrouz","Liam","Dentiste");
		FicheSuivi fs = new FicheSuivi(dent);
		
		CompteRendu cr = new CompteRendu(dent);
		CompteRendu cr2 = new CompteRendu(dent);
		String n = new String("Bonjour");
		String n2 = new String("Comment");
		cr.setCorps(n);
		cr2.setCorps(n2);
		
		fs.ajouterCompteRendu(cr);
		fs.ajouterCompteRendu(cr2);
		
		ArrayList<CompteRendu> cl = new ArrayList<CompteRendu>();
		cl.add(cr);
		cl.add(cr2);
		
		assertEquals(fs.getCr(), cl);
	}

}
