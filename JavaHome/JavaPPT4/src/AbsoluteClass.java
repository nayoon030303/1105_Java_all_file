import java.util.Scanner;

public class AbsoluteClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("Àý´ë°ª:"+getabs(input));
		
	}
	public static int getabs(int input) {
		if(input<0) {
			input*=-1;
		}
		return input;
		
	}
}
