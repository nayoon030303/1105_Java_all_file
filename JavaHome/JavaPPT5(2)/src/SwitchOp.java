import java.util.Scanner;

public class SwitchOp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		String str = scan.next();
		int num2 = scan.nextInt();
		int result = 0;
		switch(str) {
		case "+": result = (num1+num2); break;
		case "-": result = (num1-num2); break;
		case "*": result = (num1*num2); break;
		case "/": result = (num1/num2); break;
		}
		System.out.println(result);
	}
}
