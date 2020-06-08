package Account;

class Account {
	private String a_number;
	private int balance;
	
	public Account() {}
	public Account(String a_number, int balance) {
		super();
		this.a_number = a_number;
		this.balance = balance;
	}
	public String getA_number() {
		return a_number;
	}
	public void setA_number(String a_number) {
		this.a_number = a_number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		this.balance+=money;
	}
	public void withdraw(int money) {
		if(balance<money) {
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
		}else {
			this.balance-=money;
		}
	}
	@Override
	public String toString() {
		return "Account [°èÁÂ¹øÈ£ =" + a_number + ", ÀÜ°í =" + balance + "]";
	}
	
}
