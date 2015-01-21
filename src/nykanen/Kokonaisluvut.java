package nykanen;
import java.lang.Math;

public class Kokonaisluvut {
    
    public static boolean isInteger(double number) {	
        double smaller = Math.floor(number);
        double bigger = Math.ceil(number);
        final double EPSILON = 0.000001;
        if (number - smaller < EPSILON || bigger - number < EPSILON) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i=1; i < 1001; i++) {
            double squareRoot = Math.sqrt(i);
            boolean sqrIsInteger = isInteger(squareRoot);
            if (sqrIsInteger) {
                System.out.println(i);
            }
        }
    }

}
