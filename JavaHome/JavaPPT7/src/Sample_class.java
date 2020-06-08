
public class Sample_class {
	public static void main(String[] args) {
		Ex_class ex = new Ex_class(); 
		ex.car_name = "그랜저";
		//ex.size = 2500; 오류
		
	}
}

class Ex_class{
	String car_name;
	private int size;
}