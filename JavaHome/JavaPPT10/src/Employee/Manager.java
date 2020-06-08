package Employee;

public class Manager extends Employee {
	private int bonus;

	public Manager() {}

	public Manager(String name, int number, int salary,int bonus) {
		super(name, number, salary);
		setBonus(bonus);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void up() {
		super.salary = salary+salary*20;
	}

	@Override
	public String toString() {
		return "Manager [�̸�=" + getName() + ",���= " + getNumber()
				+ ", ����=" + getSalary() +"���ʽ�= "+getBonus()+ "]";
	}
	
}
