class D{
	int a, b, c;
	String name;
	public D() {}
	public D(int a) {		
		this.a = a;		
	}
	public D(int a, int b) {
		this(a);
//		this.a = a;
		this.b = b;
	}
	public D(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}
	public D(int a, int b, String name) {
		
	}
	
//	int sum() {		return a+b;	}
//	int sum(int c) {		return c+b;	}
//	int sum(int c, int d) {		return c+d;	}
	void print() {
		System.out.println("DŬ?????? ??ü");
	}
}

public class ObjTest {
	public static void main(String[] args) 
	{
		D d = new D(1, 2, "ȫ?浿");
		System.out.println("a = " + d.a + "b = " + d.b + " name = " + d.name);
//		System.out.println(d.sum());
//		System.out.println(d.sum(1));
//		System.out.println(d.sum(2, 3));
	}
}
