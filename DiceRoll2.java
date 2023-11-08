// Question 6, Expansion 1
public class DiceRoll2 {
    public static void main(String[] args){
        int max = Integer.parseInt(args[0]);
        System.out.println((int)((Math.random() * max) + 1));
    }
}
