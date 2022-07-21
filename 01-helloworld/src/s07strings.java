
public class s07strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		string literal
	   String name= "max";
//string is an object. string pooling happens in heap memory 
	   System.out.println(name);
	   System.out.println(name.length());
	   
//	   ways to create string
	   
	   String s2= new String("Something");
	   System.out.println(s2);
			   
//			   CHAR ARRAY
			   char[] c= {'h','e','l','l','o'};
			   String s3=new String(c);
			   System.out.println(s3);
//			   byte array
			   byte[] b= {65,66,67};
			   String s4=new String(b);
			   System.out.println(s4);
//			   u can't produce string with int array
	}

}
