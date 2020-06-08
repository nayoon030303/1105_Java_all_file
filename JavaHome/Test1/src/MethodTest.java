import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		num=absoulute(num);
		System.out.println(num);
	}
	static int absoulute(int n) {
		if(n<=0) {
			n = n*(-1);
		}
		return n;
		
	}

}
