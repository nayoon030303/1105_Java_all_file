
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
		System.out.println("�ްԺ����� ���޵�:"+str);
	}
	void show() {
		System.out.println("�����ε� �޼���");
	}
}
