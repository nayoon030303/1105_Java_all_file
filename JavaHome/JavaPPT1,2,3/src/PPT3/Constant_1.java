package PPT3;
import java.util.Scanner;

public class Constant_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STA = 85;
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scan.nextInt();
		
		if(STA<=score) {
			System.out.println("���");
		}else {
			System.out.println("Ż��");
		}
	}
}
