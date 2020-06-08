package Point;


public class PointEx{
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX_coordinate(1.23);
		p1.setY_coordinate(3.1);
		p1.printAttr();
		
		
		Circle c1 = new Circle(1.2,3.4,6.0);
		c1.printAttr();
	}
}


class Point {
	private double  x_coordinate,y_coordinate;
	
	public Point() {
		this.x_coordinate = 0;
		this.y_coordinate = 0;
	}
	public Point(double x_coordinate, double y_cordinate) {
		super();
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_cordinate;
	}
	public double getX_coordinate() {
		return x_coordinate;
	}
	public void setX_coordinate(double x_coordinate) {
		this.x_coordinate = x_coordinate;
	}
	public double getY_coordinate() {
		return y_coordinate;
	}
	public void setY_coordinate(double y_coordinate) {
		this.y_coordinate = y_coordinate;
	}
	public void printAttr() {
		System.out.println("x: "+getX_coordinate()+" y:"+getY_coordinate());
	}
	
}

class Circle extends Point{
	private double radius;
	final double PI = 3.14;
	
	public Circle() {
		super();
		this.radius = 0;
	}
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		 return  getRadius()*getRadius();
	}
	public void printAttr() {
		System.out.println("x:"+getX_coordinate()+" y:"+getY_coordinate()+" ¹ÝÁö¸§:"+getRadius()+" ³ÐÀÌ:"+getArea());
	}
}
