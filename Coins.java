/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
    
		int c = num1%25 ;
		int q = num1/25 ; 
	
		System.out.println(q  + " " + "quarters" + " " + c + " " + "cents");
	}
}