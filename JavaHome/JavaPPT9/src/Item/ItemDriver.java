package Item;

public class ItemDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client("ȫ�浿",100000);
		Item i1 = new Item("mouse",7000,50);
		c1.show();
		i1.show();
		c1.buy(10, i1.getPrice());
		i1.calculate(10);
		c1.show(i1.getName());
		i1.show();
	}

}
