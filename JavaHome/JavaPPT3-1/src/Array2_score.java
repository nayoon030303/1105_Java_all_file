import java.util.Scanner;

public class Array2_score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t�ϼ���\tâ�Ǽ�\t���ص�");
		int[][] a = new int[5][3];
		int[] sum = new int[5];
		
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"��\t");
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
		System.out.println("\t�ְ���:"+max_group+"��° �� ->����:"+max_score);
		
	}
}
