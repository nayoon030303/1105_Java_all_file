
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
		System.out.println("�̸�:"+name);
	}
}
class B extends A{
	void show() {
		System.out.println("�� ������ ��Ӱ��迡 �ִ� Ŭ�������� �޼��� �������̵� �����Դϴ�.");
		System.out.println("�̸�:"+name);
	}
}
