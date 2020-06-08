import java.util.Scanner;

public class Absolute_method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(absoulte(n));
	}
	public static int absoulte(int n) {
		if(n<=0) {
			n = n*(-1);
		}
		return n;
	}
}
