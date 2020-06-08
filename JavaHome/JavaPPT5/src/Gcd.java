import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두수를 입력하시오:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int max,min,result;
		if(a>b) {
			max = a;
			min=b;
			result = a-b;
		}else {
			max=b;
			min=a;
			result = b-a;
		}
		while(min!=result) {
			max = result;
			result = max-min;
		}
		System.out.println(result);
	}
}
