// Question 5
public class CircleArea {
    public static void main(String[] args){
        int input = Integer.parseInt(args[0]);
        int radius = Math.abs(input);
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Radius: " + radius + " , Area: " + area);
    }
}
