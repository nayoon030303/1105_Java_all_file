package Book;

public class BookDriver {

	public static void main(String[] args) {
		Book b1 = new Book("������","ä����",8400,12);
		b1.setPrice(10200);
		System.out.println(b1.toString());
		System.out.println("�����:"+b1.allp(10));
		System.out.println(b1.allp(5));
		System.out.println(b1.toString());
	}

}
