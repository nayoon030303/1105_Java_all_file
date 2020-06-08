package Item;


public class Item {
	private String name;
	private int price;
	private int quantity;
	private int allPrice;
	public Item() {}
	public Item(String name, int price, int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void calculate(int n) {
		quantity-=n;
		allPrice = n*price;
	}
	public void show() {
		System.out.println("이름:"+getName()+"  가격"+getPrice()+"  수량:"+getQuantity()+"  매출:"+allPrice);
	}
}
