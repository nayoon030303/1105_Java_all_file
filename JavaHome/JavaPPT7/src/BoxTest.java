
public class BoxTest {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.volume(3, 10, 5);
	}
}
class Box{
	int width;
	int height;
	int depth;
	
	public void volume(int width, int height, int depth) {
		int volume;
		volume = width*height*depth;
		System.out.println("ºÎÇÇ:"+volume);
	}
}
