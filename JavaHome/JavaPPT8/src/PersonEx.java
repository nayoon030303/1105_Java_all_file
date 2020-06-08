import java.util.Scanner;

public class PersonEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstname = scan.next();
		String lastname = scan.next();
		Person p1 = new Person(firstname,lastname);
		System.out.println(p1.toString());
		System.out.println(p1.getLength());
	}
}

class Person{
	private String firstname;
	private String lastname;
	
	public Person() {}
	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getLength() {
		return firstname.length()+lastname.length();
		
	}
	
	@Override
	public String toString() {
		return "Person [º∫:" + firstname + ",¿Ã∏ß:" + lastname + "]";
	}
	
	 
}