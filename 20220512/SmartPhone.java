
public class SmartPhone extends Calc implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리링");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다");
	}
	public void scheudle() {
		System.out.println("일정 관리합니다");
	}
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printlogo();
		phone.sendCall();
		System.out.println("3과 5를 더하면" + phone.calculate(3, 5));
		phone.scheudle();
	}
}
