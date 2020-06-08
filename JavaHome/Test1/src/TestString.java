
public class TestString {
	public static void main(String[] args) {
		String str = "java";
		int length = str.length();
		System.out.println(solution(str,length));
		
	}
	public static String solution(String str,int length) {
		return str.substring(0,length-1);
		
	}
}

