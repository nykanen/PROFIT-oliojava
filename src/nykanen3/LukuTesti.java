package nykanen3;

import java3esimerkit.Lukija;

public class LukuTesti {
	
	private int luku1, luku2;
	
	public Kokonaisluku kysely() {
		luku1 = Lukija.lueInt("Anna luku");
		luku2 = Lukija.lueInt("Anna toinen luku");
		Kokonaisluku luku = new Kokonaisluku(luku1);
		return luku;
	}

	public static void main(String[] args) {
		LukuTesti testi = new LukuTesti();
		
		Kokonaisluku luku = testi.kysely();
		luku.lisaa(testi.luku2);
		System.out.println(testi.luku1 + " + " + testi.luku2 + " = " + luku.getLuku());
		
		luku = testi.kysely();
		luku.kerro(testi.luku2);
		System.out.println(testi.luku1 + " * " + testi.luku2 + " = " + luku.getLuku());
		
		luku = testi.kysely();
		luku.jaa(testi.luku2);
		System.out.println(testi.luku1 + " / " + testi.luku2 + " = " + luku.getLuku());
		
		Kokonaisluku luku2 = new Kokonaisluku(6);
		testi.luku1 = Lukija.lueInt("Anna luku");
		luku = new Kokonaisluku(testi.luku1);
		luku.lisaa(luku2);
		System.out.println(testi.luku1 + " + " + luku2.getLuku() + " = " + luku.getLuku());
		luku = new Kokonaisluku(testi.luku1);
		luku.vahenna(luku2);
		System.out.println(testi.luku1 + " - " + luku2.getLuku() + " = " + luku.getLuku());
		luku = new Kokonaisluku(testi.luku1);
		luku.kerro(luku2);
		System.out.println(testi.luku1 + " * " + luku2.getLuku() + " = " + luku.getLuku());
		luku = new Kokonaisluku(testi.luku1);
		luku.jaa(luku2);
		System.out.println(testi.luku1 + " / " + luku2.getLuku() + " = " + luku.getLuku());
	}

}
