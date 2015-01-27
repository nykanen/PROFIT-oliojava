package nykanen;

/**
 * Luodaan luokka, joka tekee sanoille temppuja
 * 
 * @author Ari Tuhkala
 *
 */
public class Sanakone {

	/**
	 * Muutetaan merkkijonotaulukon avulla joka toinen kirjain isoksi
	 * 1) Muuta ensin merkkijono merkkijonotaulukoksi (tutki Java API String)
	 * 
	 * 
	 * @param sana
	 * @return
	 */
	private String jokaToinenIsona(String sana) {

		// Otetaan talteen sanan pituus
		int sananPituus = sana.length();

		// Luodaan uusi kirjaintaulu, joka on saman pituinen kuin alkuperäinen
		// merkkijono
		char[] kirjainTaulu = new char[sananPituus];
		// Alustetaan yksi kirjainmuuttuja isoksi muuttamista varten
		char kirjain;

		// Alustetaan laskuri
		int i = 0;

		// Käydään sana läpi ja muutetaan joka toinen kirjain isoksi ja lisätään
		// samalla kirjaimet taulukkoon
		while (i < sananPituus) {
			kirjain = sana.charAt(i);
			
			if ((i % 2) == 0) {
				kirjain = Character.toUpperCase(kirjain);
			}
			else {
				kirjain = Character.toLowerCase(kirjain);
			}
			
			kirjainTaulu[i] = kirjain;

			// Kasvatetaan laskuria
			i++;
		}

		// Muutetaan kirjaintaulu merkkijono-olioksi ja palautetaan
		return new String(kirjainTaulu);
	}

	/**
	 * Markon ratkaisu sovellettuna
	 * Tehtävä: toteuta metodi StringBuilderin avulla
	 * 
	 * @author Marko Back
	 * @param merkkijono
	 * @return merkkijono, jossa joka toinen isona
	 */
	public String jokaToisenIsonaPaluu(String merkkijono) {
		StringBuilder jokatoinen = new StringBuilder("");
		
		for (int i=0; i < merkkijono.length(); i++) {
			if ((i % 2) == 0) {
				jokatoinen.append(Character.toUpperCase(merkkijono.charAt(i)));
			}
			else {
				jokatoinen.append(Character.toLowerCase(merkkijono.charAt(i)));
			}
		}
		
		return jokatoinen.toString();
	}

	/**
	 * Naapurinpojan koodailut. Mikä tässä mättää?
	 * 
	 * @param sana
	 * @return
	 */
	private String huonoTapa(String sana) {
		int i = 0;
		String uusiJono = "";
		while (i < sana.length()) {
			if ((i % 2) == 0) {
				uusiJono = uusiJono + Character.toUpperCase(sana.charAt(i));
			}
			else {
				uusiJono = uusiJono + Character.toLowerCase(sana.charAt(i));
			}
			i++;
		}
		return uusiJono;

	}

	/**
	 * Sanakoneen käynnistysmetodi
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Sanakone sanakone = new Sanakone();
		String sana = "Aasin silta alla auringon maan taivaan pääkallon";
		System.out.println("Alkuperäinen sana: " + sana);

		String huonoSana = sanakone.huonoTapa(sana);
		System.out.println("Naapurinpojan ratkaisu: " + huonoSana);
		
		String uusisana = sanakone.jokaToinenIsona(sana);
		System.out.println("Joka toinen kirjain isona: " + uusisana);

		// Markon ratkaisu StringBuilderin avulla

		String aasiMerkkijono = "Aasin silta alla auringon maan taivaan pääkallon";
		String tulosMerkkijono = sanakone.jokaToisenIsonaPaluu(aasiMerkkijono);
		System.out.println("Markon ratkaisu: " + tulosMerkkijono);
		

	}

}
