
public class Radion implements Sound{
	private int SndLevel;
	
	public Radion() {
		super();
		SndLevel = 0;
	}

	@Override
	public void soundUp(int level) {
		SndLevel+=level;
		
	}

	@Override
	public void soundDown(int level) {
		SndLevel-=level;
		
	}
	
	@Override
	public String toString() {
		return "Radion [SndLevel=" + SndLevel + "]";
	}

	public static void main(String[] args) {
		Sound tv = new Tv();
		tv.soundUp(10);
		System.out.println(tv.toString());
		
		Sound radio = new Radion();
		radio.soundUp(11);
		radio.soundDown(4);
		System.out.println(radio.toString());
		
		
	}
}