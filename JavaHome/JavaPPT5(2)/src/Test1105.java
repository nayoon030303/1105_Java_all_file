import java.util.Scanner;

public class Test1105 {
	public static void main(String[] args) {
		System.out.println("국어,영어,수학 순서대로 입력하시오");
		int score1 = keyInput();
		int score2 = keyInput();
		int score3 = keyInput();
		
		getResult(score1, score2, score3);
		getResult2(score1, score2, score3);
	}
	public static int keyInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오:");
		int score = scan.nextInt();
		return score;
	}
	public static void getResult(int score1, int score2, int score3) {
		System.out.println("---------------성적 처리 결과------------------");
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
		System.out.println("합겨:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("성취도:"+s);
		
		
	}
	public static void getResult2(int score1, int score2, int score3) {
		
		int min = 0;
		String s = "";
		if(score1<score2) {
			if(score1<score3) {
				min = score1;
				s = "국어";
			}else {
				min = score3;
				s ="수학";
			}
		}else {
			if(score2<score3) {
				min = score2;
				s = "영어";
			}else {
				min = score3;
				s ="수학";
			}
		}
		System.out.println("----------노력이 가장 필요한 과목----------");
		System.out.println("과목:"+s);
		System.out.println("점수:"+min);
	}
}
