import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 3개 입력하십시오.");
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i+">>");
			try {
				n = sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("정수가 아닙니다. 다시 입력해주시길 바랍니다");
				sc.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합은 " +sum);
		sc.close();
	}
}
