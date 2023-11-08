// Question 4
public class PythagoreanTheorem {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        long aSquared = (long) Math.pow(a, 2);
        long bSquared = (long) Math.pow(b, 2);
        long cSquared = aSquared + bSquared;
        double c = Math.sqrt(cSquared);
        System.out.println("c : = " + c);
    }
}
