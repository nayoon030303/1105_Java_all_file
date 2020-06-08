import java.sql.PreparedStatement;

public class EmployeeEx {
	public static void main(String[] args) {
		
	}
}

class Employee{
	private String name;
	protected int salary;
	protected int standard;
	public Employee() {}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public void calculation() {
		
	}
	public void upmoney() {
		
	}
}
class Developer extends Employee{
	private String in;
	private int perpay;
	public Developer() {
		super();
	}
	public Developer(String name, int salary, int perpay, String in) {
		super(name, salary);
		this.perpay = perpay;
		this.in = in;
	}
	
	@Override
	public void calculation() {
		salary = standard + perpay;
	}
	
	@Override
	public void upmoney() {
		salary+=standard*0.05;
	}
}

class Desinger extends Employee{
	private int bonus;

	public Desinger() {
		super();
	}

	public Desinger(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
}
