// Question 3
public class Rounding {
    public static void main(String[] args) {
        double value = Double.parseDouble(args[0]);
        int rounded = (int) (value + 0.5);
        System.out.println("Rounded value of " + value + " is: " + rounded);
    }
}
