import java.util.Scanner;

public class Tax_calculate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연간 근로소득을 입력하시오(단위:만원):");
		int salary = scan.nextInt();
		double tax = 0;
		if(salary<=2000) {
			tax = salary*0.05;
		}else if(salary>2000 && salary<=4000) {
			tax = salary*0.15;
		}else if(salary>4000 && salary<=8000) {
			tax = salary*0.25;
		}else {
			tax = salary*0.40;
		}
		
		System.out.println("tax:"+tax);
	}
}
