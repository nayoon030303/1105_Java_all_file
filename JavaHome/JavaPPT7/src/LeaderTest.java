
public class LeaderTest {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 18;
		boolean check = false;
		Leader l1 = new Leader(name,age,check);
		l1.isLeader(check);
	}
}

class Student{
	private String name;
	private int age;
	//매개변수 없는 생성자 메서드
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
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
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
			System.out.println(super.getName()+"은/는 학급회장입니다.");
		}else {
			System.out.println(super.getName()+"은/는 학급회장이 아닙니다.");
		}
		
	}
	
}