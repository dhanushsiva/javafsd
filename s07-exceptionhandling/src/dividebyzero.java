import java.util.Scanner;

public class dividebyzero {

	public static void main(String[] args) {
		int a, b, c, d;
		System.out.println("enter two integer");
	    try 
		{
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = a / b;
			d = a % b;
			System.out.println(a + "/" + b + "=" + c + "remainder=" + d);
		} 
	
	    catch(ArithmeticException e) 
		{
			System.out.println("DIVISION BY ZERO OCCURED");
		}
		System.out.println("process continous");
	}
}
