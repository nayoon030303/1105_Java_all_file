
public class TowBox {
	public static void main(String[] args) {
		BoxConst b = new BoxConst(1, 2, 3);
		b.volume();
	}
}

class BoxConst{
	int width;
	int height;
	int depth;
	
	public BoxConst(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public void volume() {
		int volume = width*height*depth;
		System.out.println("ºÎÇÇ:"+volume);
	}
	
	  
}