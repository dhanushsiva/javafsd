
public class stringmethods {

	public static void main(String[] args) {
		String s="hello world";
		System.out.println("length of s="+s.length());
		System.out.println("index of w="+s.indexOf('w'));
		System.out.println("char at 3=" + s.charAt(3));
		System.out.println("index of 1st l="+s.indexOf('l'));
		System.out.println("index of 2nd l="+s.indexOf('l',3));
		System.out.println("index of last l="+s.indexOf('l',5));
		System.out.println("index of space="+ s.indexOf(" "));
		System.out.println(" ");
		System.out.println("substring:"+ s.substring(6));
		System.out.println("substring to get lowo:"+ s.substring(3,8));
		
		
	    String[] S2= s.split(" ");
//	    THIS SPLITS AT THE GAP
//	    AND BREAKS IT INTO TWO STRINGS
	    System.out.println(S2[0]);
	    System.out.println(S2[1]);
	    
	    String[] S3= s.split("o");
	    System.out.println(S3[0]);
	    System.out.println(S3[1]);
	    System.out.println(S3[2]);
	    
	    System.out.println("uppercase: "+ s.toUpperCase());
	    System.out.println("lowercase: "+ s.toLowerCase());
	}

}
