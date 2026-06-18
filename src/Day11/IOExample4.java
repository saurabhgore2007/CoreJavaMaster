package Day11;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable{
	int roll;
	String name;
	int marks;

	public Student(int r, String n, int m)
	{
		roll = r;
		name = n;
		marks = m;
	}

	public String toString()
	{
		return roll + "  " + name + "  " + marks;
	}
}

public class IOExample4 {

	public static void main(String[] args) throws IOException,ClassNotFoundException {

		File file = new File("e:/demo/studentInfo.txt");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(101, "Pankaj", 89));
		students.add(new Student(102, "Vishal", 88));
		students.add(new Student(103, "Bhartesh", 86));
		students.add(new Student(104, "Amit", 89));
		students.add(new Student(105, "Shubham", 84));

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream outs = new ObjectOutputStream(fos);
		
		for(Student s : students) {
			outs.writeObject(s);
		}
		
		outs.close();
		fos.close();

		FileInputStream fin = new FileInputStream(file);
		ObjectInputStream ins = new ObjectInputStream(fin);
	
		ArrayList<Student> studentsInfo = new ArrayList<Student>();
		
		try {
		while(true) {
			Student s = (Student)ins.readObject();
			studentsInfo.add(s);
		}
		}
		catch(EOFException  ex) {
			System.out.println(ex.getMessage());
		}
		
		for(Student stud : studentsInfo) {
			System.out.println(stud);
		}
	}

}
