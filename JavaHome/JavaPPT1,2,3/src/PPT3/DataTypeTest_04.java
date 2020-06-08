package PPT3;
import java.util.Scanner;


public class DataTypeTest_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가로: ");
		int width = scan.nextInt();
		System.out.print("세로: ");
		int height = scan.nextInt();
		
		System.out.println("넓이:"+(width*height));
	}
}
