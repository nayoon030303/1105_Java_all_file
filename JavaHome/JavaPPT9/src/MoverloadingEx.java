import java.util.Scanner;

public class MoverloadingEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a,b,c;
		Moverloading m1 = new Moverloading();
		if(num  == 1) {
			System.out.print("���簢���� ����:");
			a = scan.nextInt();
			m1.sql(a);
		}else if(num == 2) {
			System.out.print("���簢���� ����:");
			a = scan.nextInt();
			b = scan.nextInt();
			m1.sql(a,b);
		}else if(num == 3) {
			System.out.print("����ü�� ����:");
			a = scan.nextInt();
			b = scan.nextInt(); 
			c = scan.nextInt();
			m1.sql(a);
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
	}
}

class Moverloading{
	public Moverloading() {}
	public void sql(int a) {
		System.out.println("���簢���� ����:"+a*a); 
	}
	public void sql(int a, int b) {
		System.out.println("���簢���� ����:"+a*b); 
	}
	public void sql(int a, int b, int c) {
		System.out.println("����ü�� ����:"+a*b*c); 
	}
}
