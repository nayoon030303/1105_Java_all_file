package Account;

public class AccountEx {
	public static void main(String[] args) {
		Account acct = new Account("1111",10000);
		acct.deposit(20000);
		acct.withdraw(500);
		System.out.println(acct.toString());
	}
}
