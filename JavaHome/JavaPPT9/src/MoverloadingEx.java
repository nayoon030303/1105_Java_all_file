import java.util.Scanner;

public class MoverloadingEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a,b,c;
		Moverloading m1 = new Moverloading();
		if(num  == 1) {
			System.out.print("정사각형의 넓이:");
			a = scan.nextInt();
			m1.sql(a);
		}else if(num == 2) {
			System.out.print("직사각형의 넓이:");
			a = scan.nextInt();
			b = scan.nextInt();
			m1.sql(a,b);
		}else if(num == 3) {
			System.out.print("육면체의 부피:");
			a = scan.nextInt();
			b = scan.nextInt(); 
			c = scan.nextInt();
			m1.sql(a);
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}
}

class Moverloading{
	public Moverloading() {}
	public void sql(int a) {
		System.out.println("정사각형의 넓이:"+a*a); 
	}
	public void sql(int a, int b) {
		System.out.println("직사각형의 넓이:"+a*b); 
	}
	public void sql(int a, int b, int c) {
		System.out.println("육면체의 부피:"+a*b*c); 
	}
}
