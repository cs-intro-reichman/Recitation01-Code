// Question 2
public class MyModulo {
		public static void main(String[] args){
		    int a = 17;
            int b = 5;
            int divRounded = a / b; 	    //divRounded is 3
            int divMult = divRounded * b;   //divMult is 15
            int mod = a - divMult;	        //divMult is 2 
	 	    System.out.println(a + " mod " + b + " = " + mod); 
		}
}
