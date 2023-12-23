// Question 4
public class PythagoreanTheorem {
    public static void main(String[] args) {
        // getting the input
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        // Getting C^2 by formula
        long aSquared = (long) Math.pow(a, 2);
        long bSquared = (long) Math.pow(b, 2);
        long cSquared = aSquared + bSquared;
        
        // Getting C by square root
        double c = Math.sqrt(cSquared);
        System.out.println("c : = " + c);
    }
}
