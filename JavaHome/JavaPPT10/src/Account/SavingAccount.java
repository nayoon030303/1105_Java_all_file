package Account;

public class SavingAccount extends Account {
	private double Interest;

	public SavingAccount() {}
	public SavingAccount(String a_number, int balance,double interest) {
		super(a_number,balance);
		this.Interest = interest;
	}
	public double getInterest() {
		return Interest;
	}
	public void setInterest(double interest) {
		Interest = interest;
	}
	
	@Override
	public String toString() {
		return "SavingAccount [ÀÌÀ²=" + Interest + ", °èÁÂ¹øÈ£ =" + getA_number() + ", ÀÜ°í ="
				+ getBalance()+"]";
	}
	public static void main(String[] args) {
		SavingAccount sacct = new SavingAccount("1111",10000,0.1);
		System.out.println(sacct.toString());
		
	}
	
}
