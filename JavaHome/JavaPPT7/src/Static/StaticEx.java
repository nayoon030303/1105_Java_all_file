package Static;

public class StaticEx {
	public static void main(String[] args) {
		StudentStatic s1 = new StudentStatic("È«±æµ¿",18);
		StudentStatic s2 = new StudentStatic("±è¹Ì¸²",17);
		System.out.println(StudentStatic.count);
	}
}

class StudentStatic{
	static int count = 0;
	private String name;
	private int grade;
	public StudentStatic() {}
	public StudentStatic(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void show() {
		System.out.println(count);
	}
	
}