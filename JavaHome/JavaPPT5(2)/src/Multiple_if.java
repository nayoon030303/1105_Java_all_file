import java.util.Scanner;

public class Multiple_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��Ͻÿ�:");
		int number = scan.nextInt();
		if(number%3==0) {
			System.out.println("3�� ����Դϴ�.");
			if(number%5==0) {
				System.out.println("5�� ����Դϴ�.");
			}
			if(number%8==0) {
				System.out.println("8�� ����Դϴ�.");
			}
		}else if(number%5==0) {
			System.out.println("5�� ����Դϴ�. ");
			if(number%8==0) {
				System.out.println("8�� ����Դϴ�.");
			}
		}else if(number%8==0) {
			System.out.println("8�� ����Դϴ�.");
		}else {
			System.out.println("��� ����� �ƴմϴ�. ");
		}
	}
}
