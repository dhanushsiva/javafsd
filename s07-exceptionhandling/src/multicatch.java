
public class multicatch {

	public static void main(String[] args) {
		
		try{
		String input = args[0];
		System.out.println("input=" + input);
		int output = Integer.parseInt(input);
		System.out.println("output=" + output);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("input is required");
		}
		catch(NumberFormatException e) {
			System.out.println("string cant be converted to integer");
		}
		System.out.println("work must goes on");
	}

}
