import java.util.Scanner;

public class Array_sort_method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i=0 ; i<5; i++) {
			a[i] = scan.nextInt();
		}
		Array_sort(a);
		
	}
	public static void Array_sort(int[] a) {
		
		int temp = 0; 
		
		for(int i=0; i<a.length; i++) {
			for(int j =i+1; j<a.length-i; j++ ) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]  "+a[i]);
		}
	}
}
