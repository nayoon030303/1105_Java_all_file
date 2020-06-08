import java.util.Scanner;

public class Discount_method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("АЁАн:"+discountPrice(n));
	}
	public static double discountPrice(int amount) {
		double price;
		price = amount * 100000;
		if(amount>=10) {
			price = price - price*0.1;
		}
		return price;
	}
}
