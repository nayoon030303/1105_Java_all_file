import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int n=0;
		for(int i=1; i<=input; i++) {
			if(input%i==0) {
				n++;
			}
		}
		if(n>2) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}else {
			System.out.println("�Ҽ��Դϴ�.");
		}
	}

}
