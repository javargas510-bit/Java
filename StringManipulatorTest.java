import java.lang.Math;

public class StringManipulatorTest {
    public class StringManipulator {
        public double calculateHypotenuse(int legA, int legB) {
            // the hypotenuse is the side across the right angle. 
            // calculate the value of c given legA and legB
            double legC = (legA)^2 + (legB)^2;
            double squareRoot = Math.sqrt(legC);
    
            return squareRoot;
        }
    }
    public static void main(String[] args) {
        StringManipulator triangle = new StringManipulator();
        double getAnswer = triangle.calculateHypotenuse(3,12);
        
        System.out.println(getAnswer);
    }
}
