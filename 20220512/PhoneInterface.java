
public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printlogo() {
		System.out.println("**Phone**");
	};
}
