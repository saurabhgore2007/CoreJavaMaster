package Day4.Example5;

import Day4.Example5.ExamScore.Student;
import Day4.Example5.ExamScore.Subject;

/* Task5: WAP to create a class Student. 
 * Using Constructor create Array Object of three students to store rollno, name and branch. 
 * Create another class Subject and store marks scored in maths, science and in english.
 * Using Subject class Object as a Constructor Argument to Student store scored marks respectively.
 * Find who student cleared in all subjects and print the count and name of Pass and Failure. */

public class MainApp {

	public static void main(String[] args) {

		Student students[] = {
			new Student(101,"John","C.S",new Subject(98,95,96)),
			new Student(102,"Smith","I.T",new Subject(85,90,92)),
			new Student(103,"Amit","C.S",new Subject(100,100,99)),
			new Student(104,"Raj","C.S",new Subject(34,91,93))
		};
		
		int passCount = 0,failCount = 0;
		
		for(Student stud : students) {
			
			Subject s = stud.getSubject();
			if(s.getEnglish()>=35 && s.getMaths()>=35 && s.getScience()>=35) {
				System.out.println(stud.getName() + " is Passed in All Subjects.");
				passCount++;
			}
			else {
				System.out.println(stud.getName() + " is Failed in One or More Subjects.");
				failCount++;
			}
		}
		System.out.println("Total Passed Students : " + passCount);
		System.out.println("Total Failed Students : " + failCount);
	}

}
