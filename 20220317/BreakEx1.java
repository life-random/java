import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�");
		
//		while(true) {
//			System.out.print(">>");
//			String text = sc.next();
//			if(text.equals("exit"))
//				break;
		while(true) {
				System.out.print(">>");
				String text = sc.next();
				if(text.equals("exit"))
					break;
		}
		System.out.println("�����մϴ�");
	}

}
