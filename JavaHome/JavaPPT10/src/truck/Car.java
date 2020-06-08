package truck;

class Car {
	private String carname;
	private String color = "°ËÀº»ö";
	private int velocity;
	public Car() {}
	public Car(String carname, String color, int velocity) {
		super();
		this.carname = carname;
		this.color = color;
		this.velocity = velocity;
	}
	
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	void speedUp() {
		velocity+=5;
	}
	void speedDown() {
		velocity-=5;
	}
}
class Truck extends Car{
	private int ton;
	
	public Truck() {}
	public Truck(String carname, String color, int velocity, int ton) {
		super(carname,color,velocity);
		this.ton = ton;
	}
	public int getTon() {
		return ton;
	}
	public void setTon(int ton) {
		this.ton = ton;
	}
	
}