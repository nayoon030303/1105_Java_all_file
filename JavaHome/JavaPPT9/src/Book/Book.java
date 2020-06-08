package Book;

public class Book {
	private String title;
	private String author;
	private int price;
	private int stock;
	private int allPrice=0;
	public Book() {}
	public Book(String title, String author, int price, int stock) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void salesVolume(int n) {
		stock-=n;
		if(stock<=0) {
			System.out.println("신판을 추가 주문합니다.");
			stock+=30;
		}
		
	}
	public int allp(int n) {
		salesVolume(n);
		allPrice += n*price;
		return allPrice;
	}
	@Override
	public String toString() {
		return "Book [도서명:" + title + ", 저자:" + author + ", 가격:" + price + ", 재고량:" + stock + "]";
	}
	
}
