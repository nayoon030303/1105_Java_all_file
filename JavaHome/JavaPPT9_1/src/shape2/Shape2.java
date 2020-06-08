package shape2;

public abstract class  Shape2 {
	private String name;
	static int i;
	
	public Shape2() {
		i++;
	}
	public Shape2(String name) {
		super();
		this.name = name;
		i++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getI() {
		return i;
	}
	public abstract double getRectangle();
	public abstract double getCircle();
	public abstract double getTriangle();
	
}
