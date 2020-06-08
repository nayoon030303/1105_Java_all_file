
public class Array_sum {
	public static void main(String[] args) {
		int[] a = new int[100];
		int sum = 0;
		for(int i =0; i<100; i++) {
			a[i] = i+1;
			if((i+1)%2==0) {
				sum-=a[i];
			}else {
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}
