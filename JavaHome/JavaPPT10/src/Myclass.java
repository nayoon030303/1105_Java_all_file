 class GrandFather{
	 private String name;
	 public GrandFather() {}
	 public GrandFather(String name) {
		 this.name = name;
		 System.out.println("GrandFaterh 积己磊");
	 }
 }

public class Myclass extends GrandFather {
	public Myclass(String str) {
		super(str);
		System.out.println("Myclass 积己磊");
	}
	public static void main(String[] args) {
		Myclass m = new Myclass("全辨悼");
	}
}
