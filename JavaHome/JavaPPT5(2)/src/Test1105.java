import java.util.Scanner;

public class Test1105 {
	public static void main(String[] args) {
		System.out.println("����,����,���� ������� �Է��Ͻÿ�");
		int score1 = keyInput();
		int score2 = keyInput();
		int score3 = keyInput();
		
		getResult(score1, score2, score3);
		getResult2(score1, score2, score3);
	}
	public static int keyInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�:");
		int score = scan.nextInt();
		return score;
	}
	public static void getResult(int score1, int score2, int score3) {
		System.out.println("---------------���� ó�� ���------------------");
		int sum = score1+score2+score3;
		int avg = sum/3;
		String s = "";
		if(avg>=90) {
			s = "A";
		}else if(avg>=80) {
			s = "B";
		}else if(avg>=70) {
			s = "C";
		}else {
			s = "D";
		}
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+avg);
		System.out.println("���뵵:"+s);
		
		
	}
	public static void getResult2(int score1, int score2, int score3) {
		
		int min = 0;
		String s = "";
		if(score1<score2) {
			if(score1<score3) {
				min = score1;
				s = "����";
			}else {
				min = score3;
				s ="����";
			}
		}else {
			if(score2<score3) {
				min = score2;
				s = "����";
			}else {
				min = score3;
				s ="����";
			}
		}
		System.out.println("----------����� ���� �ʿ��� ����----------");
		System.out.println("����:"+s);
		System.out.println("����:"+min);
	}
}
