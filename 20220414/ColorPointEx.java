
public class ColorPointEx {
	public static void main(String [] args) {
		Point p = new Point(); 	// Point ��ü ����
		p.set(1, 2); 						// Point Ŭ������ set() ȣ��
		p.showPoint();
		System.out.println(p.toString());

		ColorPoint cp = new ColorPoint(); 
		cp.set(3, 4); 						// Point Ŭ������ set() ȣ��
		cp.setColor("red"); 			// ColorPoint�� setColor() ȣ��
		cp.showColorPoint(); 		// �÷��� ��ǥ ���
	}
}