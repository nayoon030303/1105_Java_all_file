package Student;

public class SecondGrade implements ComputeGrade {
	private int score;
	
	@Override
	public void cGrade(int score) {
		this.score = score;
	}

	@Override
	public void pass() {
		if(score>=80) {
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("���� �� ����غ���");
		}
		
	}

}
