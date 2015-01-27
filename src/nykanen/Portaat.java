package nykanen;
import fi.jyu.mit.graphics.*;

/**
 * Portaat-luokka, joka osaa piirtää portaita ylös ja alas.
 * @author Ari Tuhkala
 * @version 1.0
 */
public class Portaat {
	
    /**
     * Aliohjelma piirtää ikkunaan yhden nousevan portaan
     * alkaen pisteestä (x,y) ja päättyen pisteeseen (x+1,y+1)
     * <pre>
     *    |-------(x+1,y+1)
     *    |
     *    |
     *    |
     *   (x,y) 
     * </pre>
     * @param window
     * @param x portaan alkupisteen x
     * @param y portaan alkupisteen y
     */
    public void porras(EasyWindow window,double x,double y) {
        window.addLine (x,y,x,y+1);
		window.addLine (x,y+1,x+1,y+1);
    }
    
    /**
     * Aliohjelma piirtää ikkunaan yhden nousevan portaan
     * alkaen pisteestä (x,y) ja päättyen pisteeseen (x+1,y+1)
     * <pre>
     * (x,y)
     *    |
     *    |
     *    |
     *    |-------(x+1,y-1)
     * </pre>
     * @param window
     * @param x portaan alkupisteen x
     * @param y portaan alkupisteen y
     */
    public void porrasAlas(EasyWindow window,double x,double y) {
        window.addLine(x, y, x, y-1);
        window.addLine(x, y-1, x+1, y-1);
    }

	/**
	 * Piirtää portaat ylös ja alas
	 * @param window ikkuna, johon piirretään
	 * @param portaidenLkm montako porrasta piirretään ylös ja alas
	 */
	public void piirraPortaat (EasyWindow window, int portaidenLkm) {
	    Portaat portaat = new Portaat();
		for (int i=0; i < portaidenLkm; i++) {
		    int c = i;
		    portaat.porras(window, c, c);
		}
		for (int i=0; i < portaidenLkm; i++) {
		    int x = i + portaidenLkm;
		    int y = portaidenLkm - i;
            portaat.porrasAlas(window, x, y);
		}
	}
    /**
     * @param args ei kŠytšssŠ
     */
    public static void main(String[] args) {
    	Portaat portaat = new Portaat();
        EasyWindow window = new EasyWindow();
        window.scale(0,0,10,10);
        
        
		//portaat.porras (window,0,0);
		//portaat.porrasAlas(window,5,5);
		//window.clear();
        
		portaat.piirraPortaat(window,5);
        window.showWindow();
    }

}
