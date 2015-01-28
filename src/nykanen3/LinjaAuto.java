package nykanen3;

/**
 * Luokka linja-auton matkustajahallintaa varten
 * 
 * @author LN
 *
 */
public class LinjaAuto {
    
    private static final int VAKIOLINJURI = 60;
    private int paikat;
    private int matkustajat = 0;
    
    /**
     * @param paikat linja-autossa yhteensa
     */
    public LinjaAuto(int paikat) {
        this.paikat = paikat;
    }
    
    /**
     * Vakio linja-auton konstruktori
     */
    public LinjaAuto() {
        this(VAKIOLINJURI);
    }
    
    /**
     * @return istumapaikkojen kokonaismaara
     */
    public int paikkojenLukumaara() { return paikat; }
    
    /**
     * @return vapaiden paikkojen maara
     */
    public int vapaitaPaikkoja() { return paikat - matkustajat; }
    
    /**
     * @return matkustajien lukumaara
     */
    public int matkustajienMaara() { return matkustajat; }
    
    /**
     * @param maara montako matkustajaa lisataan
     */
    public void lisaa(int maara) {
        int vapaata = vapaitaPaikkoja();
        if (maara > vapaata) {
            System.out.println(
                    maara + " matkustajaa ei mahdu kyytiin. Vain " + vapaata + " vapaata paikkaa." );
        }
        else {
            matkustajat += maara;
        }
    }
    
    /**
     * Lisataan yksi matkustaja
     */
    public void lisaa() { lisaa(1); }
    
    /**
     * @param maara montako matkustajaa vahennetaan
     */
    public void vahenna(int maara) {
        int kyydissa = matkustajienMaara();
        if (kyydissa == 0) {
            System.out.println("Ei matkustajia.");
        }
        else if (kyydissa < maara) {
            System.out.println(
                    maara + " matkustajaa ei voi poistua. Vain " + kyydissa + " autossa.");
        }
        else {
        matkustajat -= maara;
        }
    }
    
    /**
     * Vahennetaan yksi matkustaja
     */
    public void vahenna() { vahenna(1); }

    /**
     * Luokan testaus
     * 
     * @param args ei kaytossa
     */
    public static void main(String[] args) {
        LinjaAuto nysse = new LinjaAuto();
        nysse.vahenna();
        nysse.lisaa(40);
        System.out.println(nysse.matkustajienMaara());
        nysse.vahenna(50);
        nysse.lisaa(40);
        System.out.println(nysse.matkustajienMaara());
        nysse.vahenna(20);
        System.out.println(nysse.matkustajienMaara());
        nysse.lisaa(40);
        System.out.println(nysse.matkustajienMaara());
        nysse.vahenna();
        System.out.println(nysse.matkustajienMaara());
    }

}
