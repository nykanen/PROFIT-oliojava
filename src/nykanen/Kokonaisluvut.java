package nykanen;
import java.lang.Math;

/**
 * This class prints out integers from 1 to 1000 that have an integer root.
 * 
 * @author Lauri Nykänen
 *
 */
public class Kokonaisluvut {
    
    /**
     * This method validates whether a number is an integer.
     * 
     * @param square of the integer
     * @return boolean
     */
    public static boolean isInteger(double square) {    
        double smaller = Math.floor(square);
        double bigger = Math.ceil(square);
        final double EPSILON = 0.000001;
        if (square - smaller < EPSILON || bigger - square < EPSILON) {
            return true;
        }
        return false;
    }

    /**
     * Main method that iterates through integers from 1 to 1000
     * and prints out the integers that have an integer square root.
     * 
     * @param args not used
     */
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
