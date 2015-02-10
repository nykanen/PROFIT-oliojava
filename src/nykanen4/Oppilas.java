package nykanen4;

public class Oppilas {
	
	private String sukupuoli;
	private String nimi;
	private Oppilas seuraava;
	
	public Oppilas(String nimi, String sukupuoli, Oppilas seuraava) {
		this.sukupuoli = sukupuoli;
		this.nimi = nimi;
		this.seuraava = seuraava;
	}
	
	public String sukupuoliOn() {
		return sukupuoli;
	}
	
	public String nimiOn() {
		return nimi;
	}
	
	public Oppilas seuraavaOn() {
		return seuraava;
	}

}
