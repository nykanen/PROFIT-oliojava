package nykanen4;

import fi.jyu.mit.graphics.*;

/**
 * Harjoitellaan piirtelyÃ¤ ja kuormittamista
 * @author Ari Tuhkala
 *
 */
public class Lumiukko {

    /**
     * PiirtÃ¤Ã¤ lumiukon annettuun paikkaan
     * 
     * @param w
     * @param x
     * @param y
     * @param isonPallonSade
     * @param keskipallonSade
     * @param pikkupallonSade
     */
    public void piirraLumiukko(EasyWindow w, double x, double y, double isonPallonSade, double keskipallonSade, double pikkupallonSade) {

        double keskiPallonY = y + isonPallonSade + keskipallonSade; 

        double pikkuPallonY = y + isonPallonSade + 2*keskipallonSade + pikkupallonSade;

        w.addCircle(x,y,isonPallonSade); //piirtÃ¤Ã¤ ison pallon
        w.addCircle(x,keskiPallonY,keskipallonSade); //piirtÃ¤Ã¤ keskipallon
        w.addCircle(x,pikkuPallonY,pikkupallonSade); //piirtÃ¤Ã¤ pikkupallon

    }
    
    public void piirraLumiukko(EasyWindow w, Piste piste, double isonPallonSade, double keskipallonSade, double pikkupallonSade) {
        w.addCircle(piste.getX(), piste.getY(), isonPallonSade);
        piste.moveY(isonPallonSade + keskipallonSade);
        w.addCircle(piste.getX(), piste.getY(), keskipallonSade);
        piste.moveY(keskipallonSade + pikkupallonSade);
        w.addCircle(piste.getX(), piste.getY(), pikkupallonSade);
    }

    public void piirraLumiukko(EasyWindow w, double x, double y) {
        this.piirraLumiukko(w, x, y, 35, 25, 10);
    }

    public void piirraLumiukko(EasyWindow w, double x, double y, double isonPallonSade) {
        double keskipallonSade = 25.0 * isonPallonSade / 35.0;
        double pikkupallonSade = 10.0 * isonPallonSade / 35.0;
        this.piirraLumiukko(w, x, y, isonPallonSade, keskipallonSade, pikkupallonSade);
    }

    public void piirraLumiukko(EasyWindow w, double x, double y, double isonPallonSade, double keskipallonSade) {
        double pikkupallonSade = keskipallonSade * keskipallonSade / isonPallonSade; 
        this.piirraLumiukko(w, x, y, isonPallonSade, keskipallonSade, pikkupallonSade);
    }

    public static void main(String[] args) {
        //Luodaan uusi ikkuna
        EasyWindow window = new EasyWindow();

        window.scale(0, 0, 1000, 1000);

        //Luodaan lumiukko-olio
        Lumiukko lumiukko = new Lumiukko ();

        // PiirretÃ¤Ã¤n lumiukko (ikkuna, johon piirretÃ¤Ã¤n,x,y,alimman pallon sÃ¤de, keskipallon sÃ¤de, ylimmÃ¤n pallon sÃ¤de)
        lumiukko.piirraLumiukko(window,100,100,35,25,10);

        /**
         *PistÃ¤ alla olevat toimimaan
         * 
         *lumiukko(window, x, y); // piirtÃ¤Ã¤ standardikokoisen lumiukon
         *lumiukko(window, x, y, isonPallonSade);
         *lumiukko(window, x, y, isonPallonSade, keskiPallonSade); 
         *lumiukko(window, x, y, isonPallonSade, keskiPallonSade, pienenPallonSade);
         **/
        lumiukko.piirraLumiukko(window, 50, 100);
        lumiukko.piirraLumiukko(window, 200, 100, 60);
        lumiukko.piirraLumiukko(window, 300, 100, 60, 20);
        
        Piste piste = new Piste(500,100);
        lumiukko.piirraLumiukko(window, piste, 35, 25, 10);

        // NÃ¤ytetÃ¤Ã¤n ikkuna
        window.showWindow();
    }

}
