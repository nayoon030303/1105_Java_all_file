

class AA {
  int x;
}
class B extends AA{
	String x;
}

public class A{
	public static void main(String[] args) {
		B b = new B();
		b.x = "100";
		System.out.println(b.x);
	}
}
