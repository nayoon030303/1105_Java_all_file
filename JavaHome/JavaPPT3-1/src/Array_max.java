import java.util.Scanner;

public class Array_max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String max_n = null;
		int max = 0;
		int[] score = new int[10];
		String[] name = new String[10];
		for(int i=0; i<10; i++) {
			name[i] = scan.next();
			score[i] = scan.nextInt();
			if(max<score[i]) {
				max = score[i];
				max_n = name[i];
			}
		}
		
		System.out.print("<최고점>  이름:"+ max_n);
		System.out.println("  점수:"+ max);
	}
}
