package Account;

public abstract class Account {
	private String serialAccid;
	private int accId;	//����
	private int balance;	//�ܰ�
	@Override
	public String toString() {
		return "Account [serialAccid=" + serialAccid + ", accId=" + accId + ", balance=" + balance + "]";
	}
	
}
