import java.util.Scanner;

public class Array2_score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t완성도\t창의성\t이해도");
		int[][] a = new int[5][3];
		int[] sum = new int[5];
		
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"조\t");
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = scan.nextInt();
				sum[i]+=a[i][j];
			}
		}
		
		int max_score = 0;
		int max_group = 0;
		for(int i=0; i<a.length; i++) {
			if(max_score<sum[i]) {
				max_score = sum[i];
				max_group = i+1;
			}
		}
		System.out.println("\t최고팀:"+max_group+"번째 팀 ->점수:"+max_score);
		
	}
}
