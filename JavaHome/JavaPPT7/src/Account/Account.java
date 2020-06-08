package Account;

class Account {
	private String number;
	private int money;
	public Account() {
		super();
	}
	public Account(String number) {
		super();
		setNumber(number);
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void deposit(int addmoney) {
		this.money+=addmoney;
	}
	public void withdraw(int withmoney) {
		if(withmoney>this.money) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			this.money-=withmoney;
			System.out.println("��ݵǾ����ϴ�.");
		}
	}
	@Override
	public String toString() {
		return "Account [���¹�ȣ:" + getNumber() + ", �����ܾ�:" + getMoney() + "]";
	}
	
	
}
