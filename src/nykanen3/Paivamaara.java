package nykanen3;


/**
 * Luokka paivamaarien hallitsemiseen.
 * 
 * @author LN
 *
 */
public class Paivamaara {
    
    private String paivamaara;
    private static final int[] pitkatKuut = {1,3,5,7,8,10,12};
    
    /**
     * @param paiva
     * @param kuu
     */
    public Paivamaara(int paiva, int kuu) {
    	if (paiva < 1) {
    		System.out.println(paiva + " < 1");
    	}
    	else if (kuu < 1 || kuu > 12) {
    		System.out.println(kuu + " ei ole kuukausi.");
    	}
    	else if (kuu == 2) {
    		if (paiva > 29) {
    			System.out.println("Helmikuussa on korkeintaan 29 paivaa.");
    		}
    		else this.paivamaara = paiva + "." + kuu;
    	}
    	else if (onPitkaKuukausi(kuu)) {
    		if (paiva > 31) {
    			System.out.println("Kuussa on korkeintaan 31 paivaa.");
    		}
    		else this.paivamaara = paiva + "." + kuu;
    	}
    	else if (paiva > 30) {
    		System.out.println("Kuussa " + kuu + " on vain 30 paivaa.");
    	}
    	else this.paivamaara = paiva + "." + kuu;
    }
    
    public static boolean onPitkaKuukausi(int kuu) {
        for (int k : pitkatKuut) {
            if (k == kuu) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() { return paivamaara; }

    /**
     * Main-metodi luokan testaamista varten.
     * 
     * @param args ei kaytossa
     */
    public static void main(String[] args) {
        Paivamaara testipaiva = new Paivamaara(1,2);
        System.out.println(testipaiva.toString());
        
        testipaiva = new Paivamaara(30,2);
        
        testipaiva = new Paivamaara(32,10);
        
        testipaiva = new Paivamaara(31,9);
        
        testipaiva = new Paivamaara(-1,9);
    }

}
