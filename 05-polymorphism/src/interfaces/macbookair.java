package interfaces;

public class macbookair extends macbook{
	@Override
	public
	void start() {
		System.out.println("Inside MacBookAir start()");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MacBookAir shutdown()");
	}
}
