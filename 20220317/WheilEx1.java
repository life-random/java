
public class WheilEx1 {
	public static void main(String[] args) {
		int i=0, sum = 0;
		
		i=1;
		while(i <= 9) {
			System.out.print(i);
			
			if (i<=9) 
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
			i++;
		}
			
	}

}
