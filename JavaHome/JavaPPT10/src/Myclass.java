 class GrandFather{
	 private String name;
	 public GrandFather() {}
	 public GrandFather(String name) {
		 this.name = name;
		 System.out.println("GrandFaterh ������");
	 }
 }

public class Myclass extends GrandFather {
	public Myclass(String str) {
		super(str);
		System.out.println("Myclass ������");
	}
	public static void main(String[] args) {
		Myclass m = new Myclass("ȫ�浿");
	}
}
