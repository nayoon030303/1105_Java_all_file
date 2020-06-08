import java.util.Scanner;

public class MaxgetMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 두개를 입력하시오:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(maxget(num1,num2));
	}
	public static int maxget(int n1, int n2) {
		int max = 0;
		
		if(n1>n2) {
			max = n1;
		}else {
			max = n2;
		}
		return max;
	}
}
