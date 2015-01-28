package nykanen;

/**
 * Luokka paivamaarien hallitsemiseen.
 * 
 * @author LN
 *
 */
public class Paivamaara {
    
    private String paivamaara;
    
    /**
     * @param paiva
     * @param kuu
     * @param vuosi
     */
    public Paivamaara(int paiva, int kuu, int vuosi) {
        this.paivamaara = paiva + "." + kuu + "." + vuosi;
    }
    
    public String toString() { return paivamaara; }

    /**
     * Main-metodi luokan testaamista varten.
     * 
     * @param args ei kaytossa
     */
    public static void main(String[] args) {
        Paivamaara testipaiva = new Paivamaara(1,2,1234);
        System.out.println(testipaiva.toString());
    }

}
