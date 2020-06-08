
public class SavingAccountEx {
	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount("1111-1234",10000);
		SavingAccount s2 = new SavingAccount("2222-1234",20000);
		
		SavingAccount.updateInterest(0.05);
		s1.claMonthInterest();
		s2.claMonthInterest();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		SavingAccount.updateInterest(0.06);
		s1.claMonthInterest();
		s2.claMonthInterest();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		
	}
}
class SavingAccount{
	private static double annualinterest;
	private String account;
	private int money;
	public SavingAccount() {}
	public SavingAccount(String account,int money) {
		super();
		setAccount(account);
		setMoney(money);
	}
	public static double getAnnualinterest() {
		return annualinterest;
	}
	public static void updateInterest(double d) {
		SavingAccount.annualinterest = d;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void claMonthInterest() {
		money = (int) (money*(annualinterest/12)+money);
	}
	@Override
	public String toString() {
		return "SavingAccount [account=" + account + ", money=" + money + "]";
	}
	
}
