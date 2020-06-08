
public class DecimalToBin {
	public static void main(String[] args) {
		
		int num = 64;
		String str = "";
		for(int i=0; i<32; i++) {
			str=num%2+str;
			num/=2;
		}
		System.out.println(str);
	}
}
