package PPT3;
import java.util.Scanner;


public class DataTypeTest_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int width = scan.nextInt();
		System.out.print("����: ");
		int height = scan.nextInt();
		
		System.out.println("����:"+(width*height));
	}
}
