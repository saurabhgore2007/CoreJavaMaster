package Day4.Example5.ExamScore;

public class Subject {

	private float maths;
	private float science;
	private float english;
	
	public Subject() {
		this.maths = 0;
		this.science = 0;
		this.english = 0;
	}
	
	public Subject(float maths,float science,float english) {
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	
	public float getMaths() {
		return maths;
	}
	
	public float getScience() {
		return science;
	}
	
	public float getEnglish() {
		return english;
	}
	
}
