import java.util.Scanner;

public class Multiple_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하시오:");
		int number = scan.nextInt();
		if(number%3==0) {
			System.out.println("3의 배수입니다.");
			if(number%5==0) {
				System.out.println("5의 배수입니다.");
			}
			if(number%8==0) {
				System.out.println("8의 배수입니다.");
			}
		}else if(number%5==0) {
			System.out.println("5의 배수입니다. ");
			if(number%8==0) {
				System.out.println("8의 배수입니다.");
			}
		}else if(number%8==0) {
			System.out.println("8의 배수입니다.");
		}else {
			System.out.println("어느 배수도 아닙니다. ");
		}
	}
}
