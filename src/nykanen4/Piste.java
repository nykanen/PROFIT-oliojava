package nykanen4;

public class Piste {
    private double x;
    private double y;
    
    public Piste(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double newX) {
        x = newX;
    }
    
    public void setY(double newY) {
        y = newY;
    }
    
    public void moveY(double movement) {
        y += movement;
    }
}
