import java.util.Scanner;

public class NewSalary_method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ����:");
		double currentSalary = scan.nextDouble();
		System.out.print("�ٹ� �򰡵��:");
		String rating = scan.next();
		
		getSalary(currentSalary,rating);
		
	}
	public static void getSalary(double currentSalary, String rating) {
		
		double raise = 0;
		double newSalary = 0;
		
		if(rating.equals("���")) {
			raise = currentSalary*0.06;
		}else if(rating.equals("����")) {
			raise = currentSalary*0.04;
		}else if(rating.equals("�ҷ�")) {
			raise = currentSalary*0.02;
		}else {
			System.out.println("����Է��ϼ̽��ϴ�. ");
		}
		newSalary=raise+currentSalary;
		System.out.println("���� �λ��:"+raise);
		System.out.println("�� ����:"+newSalary);
	}
}
