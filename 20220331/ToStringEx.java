
public class ToStringEx {
	int a, b, c;
	
	public ToStringEx(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "ToStringEx [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) {
		ToStringEx t = new ToStringEx(1,2,3);
		System.out.println(t);
		t.toString();
	} 
}
