
public class s13ternary {

	public static void main(String[] args) {

//          int age=20;
//          boolean canDrive=false;
//          if(age>18)
//          {
//        	  canDrive=true;
//          }
//          else {
//        	  canDrive=false;
//          }
//         
// 		 System.out.println("can drive?"+ canDrive);
////or this above whole can be written in a sinhle sentence
// 		 canDrive=(age>18) ? true:false;
// 		System.out.println("terneary can drive?"+ canDrive);
//	
//	
	int age=19;
	boolean haslicense=false;
	
	boolean candrive= (age>18)? true:false;
	boolean canrentcar= candrive?(haslicense?true:false):false;
	
	System.out.println("age="+age);
	System.out.println("has license="
			+ " "+haslicense);
	String result= candrive?(haslicense?"has license can drive":"no license cant drive"):"cant drive";
	System.out.println(result);
	}

}
