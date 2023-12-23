// Question 6, Expansion 2
public class DiceRoll3 {
    public static void main(String[] args){
        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);
        System.out.println((int)((Math.random() * (max - min + 1)) + min));
    }

}
