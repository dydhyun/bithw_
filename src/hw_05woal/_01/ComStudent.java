package hw_05woal._01;

public class ComStudent extends CommonStat implements Student{

	public ComStudent(int sno, String name) {
		this.sno = sno;
		this.name = name;
		this.subject = new String[10];
		this.finalExamScore = new int[subject.length];
		
	}
	
	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
		this.subject[index] = subject;
		this.finalExamScore[index] = score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("student num: " + sno);
		System.out.println("student name: " + name);
		System.out.println("subject: " + subject);
		System.out.println("finalExamScore: " + finalExamScore);
		
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		int total = 0;
		int cnt = 0;
		for(int i = 0; i < subject.length; i++) {
			if(this.subject[i] != null) {
				total += this.finalExamScore[i];
				cnt++;
			}
		}
		return total / cnt ;
	}

}
