package dynamic;

public class runtimetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		macbookpro pro = new macbookpro();
		pro.start();//operateMac(pro);
		
		macbookair air = new macbookair();
//static needed to be added at below void method for this to work
		//operateMac(air);
		macbook obj= new macbookpro();
		obj.start();
		macbook obj1= new macbook();
		obj1.start();
	}
	 void operateMac(macbook mac) {
		mac.start();
		mac.shutdown();

}}
