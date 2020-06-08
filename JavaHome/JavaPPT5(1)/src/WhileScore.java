import java.util.Scanner;

public class WhileScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input=1;
		int sum=0;
		int n=0;
		while(input!=0) {
			n++;
			input = scan.nextInt();
			sum+=input;
			
			
		}
		System.out.println("Че:"+sum);
		System.out.println("ЦђБе:"+sum/(n-1));
	}
}
