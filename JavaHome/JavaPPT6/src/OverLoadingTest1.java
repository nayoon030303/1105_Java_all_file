
public class OverLoadingTest1 {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		String str = "a";
		t1.show();
		t1.show(str);
	}
}

class Test{
	void show(String str) {
		System.out.println("메게변수가 전달됨:"+str);
	}
	void show() {
		System.out.println("오버로딩 메서드");
	}
}
