// Question 1, Expansion 2
public class FlipFlop3 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]); //adjusted line
        int b = Integer.parseInt(args[1]); //adjusted line   
        System.out.println("a: " + a + ", b: " + b); 
        System.out.println("Flipping…"); 		     
        int temp = a;		      
        a = b;
        b = temp;	
        System.out.println("a: " + a + ", b: " + b); 
      }
  
}
