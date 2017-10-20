package tp3.gestionTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import tp3.gestion.CompteRendu;
import tp3.medecin.Medecin;
import tp3.medecin.Specialite;

public class CompteRenduTest {
	
	@Test
	public void testDate() {
		Medecin spe = new Medecin("Attaf","Abbas","Medecin");
		CompteRendu cr = new CompteRendu(spe);
		Date theDate = new Date();
		cr.setDate(theDate);
		assertEquals(theDate, cr.getDate());		
	}
	
	@Test
	public void testSpe() {
		Medecin spe = new Medecin("Attaf","Abbas","Medecin");
		CompteRendu cr = new CompteRendu(null);
		cr.setSpe(spe);
		assertEquals(spe, cr.getSpe());
	}
	
	@Test
	public void testCorps() {
		Medecin spe = new Medecin("Attaf","Abbas","Medecin");
		CompteRendu cr = new CompteRendu(spe);
		String n = new String("Le patient va bien !");
		cr.setCorps(n);
		assertEquals(n, cr.getCorps());
	}

}
