
public class SmartPhone extends Calc implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("�츮��");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �Խ��ϴ�");
	}
	public void scheudle() {
		System.out.println("���� �����մϴ�");
	}
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printlogo();
		phone.sendCall();
		System.out.println("3�� 5�� ���ϸ�" + phone.calculate(3, 5));
		phone.scheudle();
	}
}
