import java.util.Scanner;

public class Divisor_method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ�:");
		int n = scan.nextInt();
		divisor(n);
		
	}
	public static void divisor(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
}
