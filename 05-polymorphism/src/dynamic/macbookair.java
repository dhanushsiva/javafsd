package dynamic;

public class macbookair extends macbook{
	@Override
	void start() {
		System.out.println("Inside MacBookAir start()");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MacBookAir shutdown()");
	}
}
