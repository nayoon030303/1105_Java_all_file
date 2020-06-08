package shipe;

class Myship extends Ship {
	private String name;
	private int passenger;
	private int lugage;
	
	public Myship(String name, int passenger, int lugage) {
		super();
		this.name = name;
		this.passenger = passenger;
		this.lugage = lugage;
	}

	@Override
	public int Passengers() {
		// TODO Auto-generated method stub
		return passenger;
	}

	@Override
	public int Luggage() {
		// TODO Auto-generated method stub
		return lugage;
	}
	public static void main(String[] args) {
		Myship m1 = new Myship("김밀미", 10, 10);
		System.out.println("최대 탑승 인원:"+m1.Passengers()+"\n최대 적재량:"+m1.Luggage());
	}
}
