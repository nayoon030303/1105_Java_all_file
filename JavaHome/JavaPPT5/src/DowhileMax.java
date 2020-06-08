import java.util.Scanner;

public class DowhileMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 1; 
		int max = 0;
		
		do {
			num = scan.nextInt();
			if(max<num) {
				max = num;
			}
		}while(num!=0);
		System.out.println(max);
	}
}
