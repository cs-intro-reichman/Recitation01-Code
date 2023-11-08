// Question 1, Expansion 1
public class FlipFlop2 {
    public static void main(String[] args){
        int a = 5;         
        int b = 7; 
        System.out.println("a: " + a + ", b: " + b); // added line 
        System.out.println("Flipping…"); 		     // added line 
        int temp = a;		      
        a = b;
        b = temp;	
        System.out.println("a: " + a + ", b: " + b); // added line 
      }
  
}
