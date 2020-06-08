package Employee;


public class Employee {
	private String name;
	private int number;
	protected int salary;
	public Employee() {}
	public Employee(String name, int number, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void up() {
		salary = salary+salary*30;
	}
	@Override
	public String toString() {
		return "Employee [이름 =" + name + ", 사번 =" + number + ", 봉급 =" + salary + "]";
	}
	
}
