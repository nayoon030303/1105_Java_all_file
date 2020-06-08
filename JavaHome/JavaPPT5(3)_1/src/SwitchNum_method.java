import java.util.Scanner;

public class SwitchNum_method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		switchNum(a, b);
	}
	public static void switchNum(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}
}
