class A {
	public A() {System.out.println("constructor A");}
	public A(int a) {System.out.println("constructor Aa");}
}
class B extends A {
	public B() {System.out.println("constructor B");}
	public B(int b) {super(2); System.out.println("constructor Bb");}
}
class C extends B {
	public C() {System.out.println("constructor C");}
	public C(int c) {super(2); System.out.println("constructor Cc");}
}
public class ConstEx {
	public static void main(String[] args) {
		C c = new C(2);
	}
}
