
public class s11conditions {

	public static void main(String[] args)
	{
		boolean isalien= true;
		if(isalien)
		{
			 System.out.println("it is an alien");
			 
		}
		if(!isalien)
		{
			 System.out.println("its not an alien");
		}
		
		int a=10,b=5,c=20;
		
		System.out.println("a<b= "+ (a<b));
		
		 System.out.println("a<b and a<c= " + (a<b && a<c)); //logical AND
		 System.out.println("a<b and a<c= " + (a<b & a<c));// BITWISE AND
	
		 System.out.println("a<b and a<c= " + (a<b || a<c)); //logical OR
		 System.out.println("a<b and a<c= " + (a<b | a<c));// BITWISE OR 
		 
		 System.out.println("a<b and a<c= " + (a<b && ++a<c)); //logical AND it checks for 1st one if false it stops
		 System.out.println("a after logical and=" +a);
		 System.out.println("a<b and a<c= " + (a<b & ++a<c));// BITWISE AND it checks for the 2nd one too
		 System.out.println("a after bitwise and=" +a);
		
		 

			// == comparison
			// = assignment
			
			boolean mybool = false;
			if (mybool=true) {
				System.out.println("X");
			} else {
				System.out.println("Y");
			}
			
			System.out.println("what will be the value ? " + (mybool=false));
	}
}
