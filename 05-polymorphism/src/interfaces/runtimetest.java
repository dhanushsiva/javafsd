package interfaces;

public class runtimetest {

	public static void main(String[] args) {
//		applelaptop al = (applelaptop) new macbookair();
//		al.start();
//		al.shutdown();

		// upcasting - implicit
		applelaptop al = new macbookair();
		al.start();
		al.shutdown();
		
		macbook macb = new macbookair();
		// downcasting - explicit
		macbookair obj = (macbookair) macb;
		
//		macbook pro = new macbookpro();
//		macbookpro obj2 = (macbookpro) pro;
//		obj2.prosmethod();
}}
