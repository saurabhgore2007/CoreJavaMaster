package Day4.Example5.ExamScore;

public class Student {

	    private int rollno;
		private String name;
		private String branch;
		private Subject subject;
		
		public Student() {
			this.rollno = 0;
			this.name = "";
			this.branch = "";
			this.subject = null;
		}
		
		public Student(int rollno, String name,String branch,Subject subject) {
			this.rollno = rollno;
			this.name = name;
			this.branch = branch;
			this.subject = subject;
		}
		
		public int getRollNo() {
			return rollno;
		}
		
		public String getName() {
			return name;
		}
		
		public String getBranch() {
			return branch;
		}
		
		public Subject getSubject() {
			return subject;
		}
		
		
}
