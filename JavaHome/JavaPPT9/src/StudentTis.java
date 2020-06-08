
class StudentTis {
	String name;
	int grade;
	int clas;
	public StudentTis() {}
	public StudentTis(String name) {
		this.name = name;
	}
	public StudentTis(String name, int grade) {
		this(name);
		this.grade = grade;
	}
}
