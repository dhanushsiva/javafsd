
public class Stringparser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String s = "abcd";
		
		int a = Integer.parseInt(s);
		System.out.println("Result: " + a);
	}
		catch(NumberFormatException e)
		{
			System.out.println("CANT CONVERT A STRING TO INTEGER");
		}
		System.out.println("work must goes on");
}}
