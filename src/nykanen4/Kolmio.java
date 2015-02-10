package nykanen4;

import fi.jyu.mit.graphics.EasyWindow;

public class Kolmio extends Kuvio {
    private double[] xpoints;
    private double[] ypoints;
	
	public Kolmio(double x0, double y0, double[] vector1, double[] vector2) {
		x = x0;
		y = y0;
		
		xpoints = new double[] {x, x+vector1[0], x+vector2[0]};
		ypoints = new double[] {y, y+vector1[1], y+vector2[1]};
	}
	
    public void drawObject(EasyWindow window) {
    	window.addPolygon(xpoints, ypoints);
    }
    
    public void setAnchor(double newX, double newY) {
    	for (int i = 0; i < 3; i++) {
    		xpoints[i] = xpoints[i] - x + newX;
    		ypoints[i] = ypoints[i] - y + newY;
    	}
    	x = newX;
    	y = newY; 
    }

    public static void main(String[] args) {
    	EasyWindow window = new EasyWindow();
    	
    	double[] v1 = {100,0};
    	double[] v2 = {50,100};
        
    	Kolmio kolmio = new Kolmio(100,100,v2,v1);
        Kolmio kolmio2 = new Kolmio(10,10,v2,v1);
        
        kolmio.drawObject(window);
        kolmio2.drawObject(window);
        kolmio.setAnchor(200, 200);
        System.out.println(kolmio.x + " " + kolmio.y);
        kolmio.drawObject(window);
    }

}
