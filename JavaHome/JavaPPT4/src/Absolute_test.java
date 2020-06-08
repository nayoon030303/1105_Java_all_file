import java.util.Scanner;

public class Absolute_test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오:");
		int input = scan.nextInt();
		if(input<0) {
			input*=-1;
		}
		System.out.println(input);
	}
}
