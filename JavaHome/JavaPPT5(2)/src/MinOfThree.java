import java.util.Scanner;

public class MinOfThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1,n2,n3;
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();		
		int min = 0;
		
		if(n1<n2) {
			if(n1<n3) {
				min = n1;
			}else {
				min = n3;
			}
		}else {
			if(n2<n3) {
				min = n2;
			}else {
				min = n3;
			}
		}
		System.out.println(min);
	}
}
