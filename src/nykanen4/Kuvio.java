package nykanen4;

import fi.jyu.mit.graphics.EasyWindow;

public class Kuvio {
    private int x;
    private int y;
    public EasyWindow window;
    
    public Kuvio() {
        x = 100;
        y = 100;
    }
    
    public int[] getCoordinates() {
        int [] coordinates = {x, y};
        return coordinates;
    }
    
    public void setCoordinates(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
    public void drawObject() {
        
    }
}
