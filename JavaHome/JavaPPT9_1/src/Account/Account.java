package Account;

public abstract class Account {
	private String serialAccid;
	private int accId;	//¿Ã¿≤
	private int balance;	//¿‹∞Ì
	@Override
	public String toString() {
		return "Account [serialAccid=" + serialAccid + ", accId=" + accId + ", balance=" + balance + "]";
	}
	
}
