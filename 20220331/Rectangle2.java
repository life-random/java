import java.util.Scanner;

class Rect{
	private int width, height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	int getArea() {
		return width * height;
	}
}
public class Rectangle2 {
	public static void main(String[] args) {
		Rect rect = new Rect();
		Scanner sc = new Scanner(System.in);
		System.out.print("��32�� �Է� : ");
		rect.setHeight(sc.nextInt());
		System.out.print("�ʺ� �Է� : ");
		rect.setWidth(sc.nextInt());
		System.out.println("�簢���� ������ " + rect.getArea());
		sc.close();
	}
}
