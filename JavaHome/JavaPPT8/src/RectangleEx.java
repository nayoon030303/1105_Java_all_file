
public class RectangleEx {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(21,5);
		r.show();
	}
}

class Rectangle{
	private int width;
	private int height;
	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	public Rectangle(int width, int height) {
		super();
		setWidth(width);
		setHeight(height);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width>20) {
			System.out.println("���� �ʰ��߽��ϴ�.");
		}else {
			this.width = width;
		}
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height>20) {
			System.out.println("���� �ʰ��߽��ϴ�.");
		}else {
			this.height = height;
		}
	}
	public int calculatePerimeter() {
		return 2*(width+height);
	}
	public int calculateArea() {
		return (width*height);
	}
	public void show() {
		System.out.println("����:"+calculateArea()+"�ѷ�:"+calculatePerimeter());
	}
	
}
