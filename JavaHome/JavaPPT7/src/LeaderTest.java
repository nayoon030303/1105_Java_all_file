
public class LeaderTest {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		int age = 18;
		boolean check = false;
		Leader l1 = new Leader(name,age,check);
		l1.isLeader(check);
	}
}

class Student{
	private String name;
	private int age;
	//�Ű����� ���� ������ �޼���
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
	 
}

class Leader extends Student{
	private boolean check;
	public Leader() {
		super();
	}
	public Leader(String name, int age, boolean check) {
		super(name, age);
		
	}
	public boolean getCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public void isLeader(boolean check) {
		if(check) {
			System.out.println(super.getName()+"��/�� �б�ȸ���Դϴ�.");
		}else {
			System.out.println(super.getName()+"��/�� �б�ȸ���� �ƴմϴ�.");
		}
		
	}
	
}