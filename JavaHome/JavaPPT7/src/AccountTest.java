
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account p1 = new Account("1111-1234");
		System.out.println(p1.fixedDeposit(2, 100));
	}

}
class Account{
	private String id;
	private int money;
	static double interest = 0.02;
	public Account() {}
	public Account(String id) {
		super();
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}	
	public int fixedDeposit(int year, int money) {
		return money+=money*year*interest;
	}
	 
}
