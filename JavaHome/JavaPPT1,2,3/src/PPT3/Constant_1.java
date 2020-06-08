package PPT3;
import java.util.Scanner;

public class Constant_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STA = 85;
		System.out.print("점수를 입력하시오: ");
		int score = scan.nextInt();
		
		if(STA<=score) {
			System.out.println("통과");
		}else {
			System.out.println("탈락");
		}
	}
}
