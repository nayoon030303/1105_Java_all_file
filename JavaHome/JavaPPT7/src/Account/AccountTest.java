package Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number ="1111-2345";
		 Account p1 = new Account(number);
		 p1.deposit(3000);
		 p1.withdraw(3300);
		 System.out.println(p1.toString());
	}

}
