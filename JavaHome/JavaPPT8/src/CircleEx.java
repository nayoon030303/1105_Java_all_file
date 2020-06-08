import java.util.Scanner;

public class CircleEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double rate = scan.nextDouble();
		Circle c1 = new Circle(rate);
		System.out.println(c1.toString());
	}
}
class Circle{
	private final double PI = 3.14;
	private double rate;
	private double width;
	private double round;
	
	public Circle(){}
	public Circle(double rate) {
		setRate(rate);
		setWidth();
		setRound();
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth() {
		this.width = rate*rate*PI;
	}
	public double getRound() {
		return round;
	}
	public void setRound() {
		this.round = 2*PI*rate;
	}
	@Override
	public String toString() {
		return "Circle [반지름=" + rate + ", 넓이=" + width + ", 둘레=" + round + "]";
	}
	
}
