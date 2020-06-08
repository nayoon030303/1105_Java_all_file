package phone;

public class PhoneBookDriver {
	public static void main(String[] args) {
		Phonebook p1 = new Phonebook(3);
		for(int i=0; i<3; i++) {
			p1.add();
		}
		System.out.println(p1.lookup("±è¹Ì¸²"));
	}
}
