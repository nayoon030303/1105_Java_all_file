
public class OverRidingTest1 {
	public static void main (String[] args) {
		A a = new A();
		a.show();
		B b = new B();
		b.show();
		
	}
}

class A{
	String name = "Class A";
	void show() {
		System.out.println("이름:"+name);
	}
}
class B extends A{
	void show() {
		System.out.println("이 예제는 상속관계에 있는 클래스간의 메서드 오버라이딩 예제입니다.");
		System.out.println("이름:"+name);
	}
}
