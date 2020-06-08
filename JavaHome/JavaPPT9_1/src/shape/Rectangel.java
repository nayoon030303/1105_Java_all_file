package shape;

public class Rectangel extends Shape {
	
	private int length;
	private int width;
	
	public Rectangel() {}
	public Rectangel(String name, int length, int width) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public int getArea() {
		return (length*width);
	}
	
	public static void main(String[] args) {
		Rectangel r1 = new Rectangel("MyR",12,10);
		System.out.println("사각형의 넓이:"+r1.getArea());
	}
	@Override
	public int getCircum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
