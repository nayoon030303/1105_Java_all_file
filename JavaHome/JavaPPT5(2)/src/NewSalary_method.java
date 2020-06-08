import java.util.Scanner;

public class NewSalary_method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현제 연봉:");
		double currentSalary = scan.nextDouble();
		System.out.print("근무 평가등급:");
		String rating = scan.next();
		
		getSalary(currentSalary,rating);
		
	}
	public static void getSalary(double currentSalary, String rating) {
		
		double raise = 0;
		double newSalary = 0;
		
		if(rating.equals("우수")) {
			raise = currentSalary*0.06;
		}else if(rating.equals("보통")) {
			raise = currentSalary*0.04;
		}else if(rating.equals("불량")) {
			raise = currentSalary*0.02;
		}else {
			System.out.println("잠못입력하셨습니다. ");
		}
		newSalary=raise+currentSalary;
		System.out.println("연봉 인상액:"+raise);
		System.out.println("새 연봉:"+newSalary);
	}
}
