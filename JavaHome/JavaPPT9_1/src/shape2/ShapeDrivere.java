package shape2;

public class ShapeDrivere extends Shape2 {
	
	private double width;
	private double height;
	private double area;
	
	
	public ShapeDrivere(String name,double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double getRectangle() {
		return width*height;
		
	}

	@Override
	public double getCircle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTriangle() {
		// TODO Auto-generated method stub
		return width*height/2;
		
	}
	public static void main(String[] args) {
		ShapeDrivere triangle1 = new ShapeDrivere("mys", 5, 3);
		System.out.println("삼각형:"+triangle1.getTriangle());
		
		ShapeDrivere square1 = new ShapeDrivere("m", 10, 7);
		System.out.println("사각형:"+square1.getRectangle());
	}

}
