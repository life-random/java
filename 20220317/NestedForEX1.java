
public class NestedForEX1 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				//System.out.println(i+"*"+j+"="+i*j);
				System.out.printf("%d*%d=%d", i, j, i*j);
				System.out.println("\t");
			}
			System.out.println();
		}
		System.out.printf("%s %f", "�����ϼ̽��ϴ�", 3.141592);
	}
}
