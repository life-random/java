
public class DoWhileEx1 {
	public static void main(String[] args) {
		char ch = 'a';
		
		do {
			//ch++;
			System.out.print(ch);
			ch = (char)(ch + 1);
		}while(ch <= 'z');
	}
}
