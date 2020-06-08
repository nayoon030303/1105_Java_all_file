import java.util.Scanner;

public class IFExam2_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		String str = scan.next();
		int num2 = scan.nextInt();
		
		if(str.equals("+")) {
			System.out.println(num1+num2);
		}else if(str.equals("-")) {
			System.out.println(num1-num2);
		}else if(str.equals("*")) {
			System.out.println(num1*num2);
		}else if(str.equals("/")){
			System.out.println(num1/num2);
		}else if(str.equals("%")){
			System.out.println(num1%num2);
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
