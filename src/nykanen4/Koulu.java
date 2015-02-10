package nykanen4;

import java.util.ArrayList;
import java.util.List;

public class Koulu {
	private Oppilas eka = null;
	private Oppilas vika = null;
	private List<Oppilas> oppilaat = new ArrayList<Oppilas>();
	
	public Koulu() {
		
	}
	
	public void uusiOppilas(String nimi, String sukupuoli) {
		Oppilas oppilas = new Oppilas(nimi, sukupuoli, vika);
		vika = oppilas;
		if (eka == null) {
			eka = oppilas;
		}
		oppilaat.add(oppilas);
	}
	
	public void poistaUusin() {
		Oppilas uusin = vika;
		Oppilas seuraava = uusin.seuraavaOn();
		oppilaat.remove(uusin);
		vika = seuraava;
	}
	
	public void listaaPojat() {
		for (Oppilas oppilas : oppilaat) {
			if (oppilas.sukupuoliOn().equals("poika")) System.out.println(oppilas.nimiOn()); 
		}
	}
	
	public void listaaTytot() {
		for (Oppilas oppilas : oppilaat) {
			//System.out.println(oppilas.nimiOn());
			if (oppilas.sukupuoliOn().equals("tytto")) System.out.println(oppilas.nimiOn()); 
		}
	}
	
	public void listaaOppilaat() {
		for (Oppilas oppilas : oppilaat) {
			System.out.println(oppilas.nimiOn());
		}
	}
	
	public void tyhjennaKoulu() {
		for (Oppilas oppilas : oppilaat) {
			while (vika != null) {
				poistaUusin();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Koulu koulu = new Koulu();
		koulu.uusiOppilas("erkki", "poika");
		koulu.uusiOppilas("petri", "poika");
		koulu.uusiOppilas("jaana", "tytto");
		koulu.uusiOppilas("tytti", "tytto");
		koulu.listaaPojat();
		koulu.listaaTytot();
		koulu.tyhjennaKoulu();
		koulu.listaaOppilaat();

	}

}
