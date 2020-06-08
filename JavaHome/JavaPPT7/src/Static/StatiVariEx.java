package Static;

public class StatiVariEx {
	public static void main(String[] args) {
		Static_sample s1 = new Static_sample();
		Static_sample s2 = new Static_sample();
		Static_sample s3 = new Static_sample();
		
		System.out.println(Static_sample.sqId);
	}
}
class Static_sample{
	private int width;
	private int height;
	static int sqId = 0;
	public Static_sample() {
		sqId ++;
	}
}
