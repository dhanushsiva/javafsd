
public class NullpointerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String s = null;
		
		System.out.println("String Length: " + s.length());
	}
		catch(NullPointerException e) {
			System.out.println("NULL CANT BE A STRING");
		}
		System.out.println("work must goes on");
	}
}
