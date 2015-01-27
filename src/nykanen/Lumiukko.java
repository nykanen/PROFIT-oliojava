package nykanen;

import fi.jyu.mit.graphics.*;

/**
 * Harjoitellaan piirtelyä ja kuormittamista
 * @author Ari Tuhkala
 *
 */
public class Lumiukko {
	
	/**
	 * Piirtää lumiukon annettuun paikkaan
	 * 
	 * @param w
	 * @param x
	 * @param y
	 * @param isonPallonSade
	 * @param keskipallonSade
	 * @param pikkupallonSade
	 */
	public void piirraLumiukko(EasyWindow w,double x, double y,double isonPallonSade, double keskipallonSade, double pikkupallonSade) {

	    double keskiPallonY = y + isonPallonSade + keskipallonSade; 
		
	    double pikkuPallonY = y + isonPallonSade + 2*keskipallonSade + pikkupallonSade;
	        
	    w.addCircle(x,y,isonPallonSade); //piirtää ison pallon
	    w.addCircle(x,keskiPallonY,keskipallonSade); //piirtää keskipallon
	    w.addCircle(x,pikkuPallonY,pikkupallonSade); //piirtää pikkupallon
	        
	}
	
	public void piirraLumiukko(EasyWindow w,double x, double y) {
    this.piirraLumiukko(w, x, y, 35, 25, 10);
	}
	
	public void piirraLumiukko(EasyWindow w,double x, double y, double isonPallonSade) {
		double keskipallonSade = 25.0 * isonPallonSade / 35.0;
		double pikkupallonSade = 10.0 * isonPallonSade / 35.0;
    this.piirraLumiukko(w, x, y, isonPallonSade, keskipallonSade, pikkupallonSade);
	}
	
	public void piirraLumiukko(EasyWindow w,double x, double y, double isonPallonSade, double keskipallonSade) {
		double pikkupallonSade = keskipallonSade * keskipallonSade / isonPallonSade; 
    this.piirraLumiukko(w, x, y, isonPallonSade, keskipallonSade, pikkupallonSade);
	}
	
    public static void main(String[] args) {
    	//Luodaan uusi ikkuna
        EasyWindow window = new EasyWindow();
        
        window.scale(0, 0, 1000, 1000);
        
        //Luodaan lumiukko-olio
        Lumiukko lumiukko = new Lumiukko ();
        
        // Piirretään lumiukko (ikkuna, johon piirretään,x,y,alimman pallon säde, keskipallon säde, ylimmän pallon säde)
        lumiukko.piirraLumiukko(window,100,100,35,25,10);
        
        /**
         *Pistä alla olevat toimimaan
         * 
    	 *lumiukko(window, x, y); // piirtää standardikokoisen lumiukon
    	 *lumiukko(window, x, y, isonPallonSade);
    	 *lumiukko(window, x, y, isonPallonSade, keskiPallonSade); 
    	 *lumiukko(window, x, y, isonPallonSade, keskiPallonSade, pienenPallonSade);
         **/
        lumiukko.piirraLumiukko(window, 50, 100);
        lumiukko.piirraLumiukko(window, 200, 100, 60);
        lumiukko.piirraLumiukko(window, 300, 100, 60, 20);
        
        
        // Näytetään ikkuna
        window.showWindow();
    }

}
