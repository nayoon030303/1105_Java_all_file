import java.util.Scanner;

public class MakePointEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("위치:");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		MakePoint m1 = new MakePoint(x, y);
		
		
		System.out.println("이동:");
		double mx = scan.nextDouble();
		double my = scan.nextDouble();
		m1.move(mx,my);
		m1.show();
	}
}

class MakePoint{
	double x,y;
	public MakePoint(double x, double y){
		super();
		this.x = x;
		this.y = y;
	}
	public void show() {
		System.out.println("x:"+x+"  y:"+y);
	}
	public void move(double x, double y) {
		this.x+=x;
		this.y+=y;
		
	}
	
}