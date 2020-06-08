
public class ForEx2 {
	public static void main(String[] args) {
		int[] a = new int[100];
		int sum = 0; 
		for(int i=0; i<100; i++) {
			a[i] = i+1;
			sum+=a[i];
		}
		System.out.println(sum);
		
	}
}
