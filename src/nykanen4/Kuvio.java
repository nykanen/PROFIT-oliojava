package nykanen4;

import fi.jyu.mit.graphics.EasyWindow;

public abstract class Kuvio {
    protected double x;
    protected double y;
    
    public Kuvio() {
        x = 100;
        y = 100;
    }
    
    /**
     * @return coordinates of the object's anchor
     */
    public double[] getAnchor() {
        double [] coordinates = {x, y};
        return coordinates;
    }
    
    
    /**
     * Method for setting object's anchor
     * 
     * @param newX
     * @param newY
     */
    public void setAnchor(double newX, double newY) {
        x = newX;
        y = newY;
    }
    
    public void drawObject(EasyWindow w) {
        
    }
}
