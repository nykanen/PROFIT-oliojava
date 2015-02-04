package nykanen3;

public class Kokonaisluku {
	
	private int arvo;
	
	public Kokonaisluku(int luku) {
		arvo = luku;
	}
	
	public Kokonaisluku() {
		this(0);
	}
	
	public int getLuku() {
		return arvo;
	}
	
	public void lisaa(int luku) {
		arvo += luku;
	}
	
	public void lisaa(Kokonaisluku luku) {
		this.lisaa(luku.getLuku());
	}
	
	public void vahenna(int luku) {
		arvo -= luku;
	}
	
	public void vahenna(Kokonaisluku luku) {
		this.vahenna(luku.getLuku());
	}
	
	public void kerro(int luku) {
		arvo = arvo * luku;
	}
	
	public void kerro(Kokonaisluku luku) {
		this.kerro(luku.getLuku());
	}
	
	public void jaa(int luku) {
		arvo = arvo / luku;
	}
	
	public void jaa(Kokonaisluku luku) {
		this.jaa(luku.getLuku());
	}
	

}
