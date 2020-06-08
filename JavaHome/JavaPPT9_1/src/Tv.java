
public class Tv implements Sound{
	private int SndLevel;
	
	public Tv() {
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
		return "Tv [SndLevel=" + SndLevel + "]";
	}
	
}

