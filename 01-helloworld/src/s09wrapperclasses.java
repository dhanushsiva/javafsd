//System.out.println();
public class s09wrapperclasses {

	public static void main(String[] args) {
	
        int y=1;
        System.out.println(y);
//        HERE Integer is an object 
//        auto boxing from int to integer
        
        Integer x=2;
        System.out.println(x);
        Integer z =new Integer(5);
//        auto unboxing from integer to int
        int myint=z;  //convert automatically-> auto-unboxing
        System.out.println(z);
        
        myint =z.intValue(); //convert explicitely from wrapper to primitive
        System.out.println(z);
        
        short a=3276;
        short newshort =a;
        System.out.println(a);
        
	}

}
