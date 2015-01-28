package nykanen3;
/**
 * Luokka henkilotietojen kasittelyyn.
 * 
 * @author LN
 *
 */
public class Henkilo {
    private String nimi;
    private String etunimi;
    private String sukunimi;
    private int syntymavuosi;
  
    /**
     * @param etunimi
     * @param sukunimi
     * @param syntymavuosi
     */
    public Henkilo(String etunimi, String sukunimi, int syntymavuosi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.syntymavuosi = syntymavuosi;
        this.nimi = etunimi + " " + sukunimi;
    }
    
    /**
     * Uuden nimen asettaminen
     * 
     * @param uNimi
     */
    public void    setNimi(String uNimi) { nimi = uNimi; }
    
    /**
     * Nimen kutsuminen
     * 
     * @return palauttaa etu- ja sukunimen
     */
    public String  getNimi()       { return nimi;       }
    
    /**
     * @return palauttaa syntymavuoden
     */
    public int     getSyntymavuosi() { return syntymavuosi; }
    
    public String  toString() {
        return etunimi + "|" + sukunimi + "|" + syntymavuosi;
    }

    /**
     * Luokan testaus
     * 
     * @param args ei kaytossa
     */
    public static void main (String [] args) {
        Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
        System.out.println(aku.getNimi());  // tulostaa Aku Ankka
        System.out.println(aku.getSyntymavuosi());  // tulostaa 1934
        System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
    }

}
