
public class CastTest {
	public static void main(String[] args) {
		byte b = 1; int i = 6;
		i = b; // 왼쪽 큰 것 오른 쪽 작은 것
		// b = 1; 온른쪽 작은 것 오른쪽 큰 것 안됨
		b = (byte)i; // 정보손실을 감수하더라도 casting을 하면 됨
		SubCls sub = new SubCls(100, 99, 100);
		SupCls sup = new SupCls(95, 89, 100);
		SupCls sup1 = new SubCls(); // 왼쪽 부모 오른 쪽 자식 허용
		Object sup2 = new SubCls();
		// SubCls sub1 = new SupCls(), 왼쪽 자식 오른쪽 부모 안됨
//		System.out.println(sub.toString());
		SubCls nsub = (SubCls)sup1;
	}
}
