package truck;
public class Truckmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck mytruck = new Truck();
		mytruck.setCarname("프론티어");
		mytruck.setTon(3);
		System.out.println("나의 트럭은"+mytruck.getColor()+"이다");
		System.out.println(mytruck.getCarname()+"는"+mytruck.getTon()+"톤을 실을 수 있다");
	}

}
