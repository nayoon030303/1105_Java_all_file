package Item;


public class Client {
	private String name;
	private int c_money;
	public Client() {}
	public Client(String name, int c_money) {
		setName(name);
		setC_money(c_money);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getC_money() {
		return c_money;
	}
	public void setC_money(int c_money) {
		this.c_money = c_money;
	}
	public void buy(int n, int price) {
		if(c_money>=n*price) {
			c_money -=n*price;
		}else {
			System.out.println("���̹��Ӵϰ� �����մϴ�");
		}
	}
	
	public void show() {
		System.out.println("�̸�:"+name+"  ���Ź�ǰ"+null+"  ���̹��Ӵ� �ܾ�:"+c_money);
	}
	public void show(String item) {
		System.out.println("�̸�:"+name+"  ���Ź�ǰ"+item+"  ���̹��Ӵ� �ܾ�:"+c_money);
	}
	
	
	
}
