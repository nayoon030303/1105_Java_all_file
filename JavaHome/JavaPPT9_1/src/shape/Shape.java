package shape;

abstract class Shape {
	
	public String name;
	public String getName() {
		return name;
		
	}
	public abstract int getArea();
	public abstract int getCircum();
}
