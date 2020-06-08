package Employee;

public class Emwon extends Manager {
	private int stock_option = 10;

	public Emwon() {}

	public Emwon(String name, int number, int salary, int bonus) {
		super(name, number, salary, bonus);
		// TODO Auto-generated constructor stub
	}

	public int getStock_option() {
		return stock_option;
	}

	public void setStock_option(int stock_option) {
		this.stock_option = stock_option;
	}
	public void up() {
		salary = salary+salary*10;
	}

	@Override
	public String toString() {
		return "Emwon [toString()=" + super.toString() +"stock_option= " + stock_option + "]";
	}
	
}
