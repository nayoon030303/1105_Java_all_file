package phone;
import java.util.Scanner;

class Phonebook {
	Scanner scan = new Scanner(System.in);
	
	private Person[] book;
	private int max;
	private String name;
	private int number;
	private int i = 0;
	public Phonebook() {}
	public Phonebook(int max) {
		super();
		this.max = max;
		this.book = new Person[max];
	}
	public void add() {
		if(i>=max) {
			System.out.println("최대로 입력하였습니다.");
		}else {	
			System.out.print("이름:");
			name = scan.next();
			System.out.print("번호:");
			number = scan.nextInt();
			book[i] = new Person(name,number);
			i++;
		}
	}
	public int lookup(String name) {
		int a = 0;
		for(int i=0; i<book.length; i++) {
			if((book[i].getName()).equals(name)) {
				a= book[i].getNumber();
			}else {
				
			}
		}
		return a;
	}
	
}
class Person{
	private String name;
	private int number;
	public Person() {}
	public Person(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}

