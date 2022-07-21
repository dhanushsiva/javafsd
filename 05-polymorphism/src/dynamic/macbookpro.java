package dynamic;

public class macbookpro extends macbook {
	@Override
	void start() {
		System.out.println("Inside MacbookPro start()");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MacbookPro shutdown()");
	}
}
