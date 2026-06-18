package Day12;

import java.util.function.Predicate;

class Student{

    int id;
    String name;
    double marks;
    
    public Student(int id,String name,double marks) {
    	this.id = id;
    	this.name = name;
    	this.marks = marks;
    }
}

public class LambdaEx3 {

	public static void main(String[] args) {

		Student s1 = new Student(101, "Saurabh", 82);
		Student s2 = new Student(102, "Amit", 65);
		Student s3 = new Student(103, "Rahul", 20);
		
		Predicate<Student> pass = s -> s.marks >= 35;
		Predicate<Student> dist = s -> s.marks >= 75;
		Predicate<Student> fail = s -> s.marks < 35;
		
		System.out.println(pass.test(s1));
		System.out.println(dist.test(s2));
		System.out.println(fail.test(s3));

		Predicate<Integer> even = n -> n%2==0;
		Predicate<Integer> odd = n -> n%2!=0;
		Predicate<Integer> greater = n -> n>50;
		Predicate<Integer> d5 = n -> n%5==0;

		System.out.println("10 is Even : " + even.test(10));
		System.out.println("7 is Odd : " + odd.test(7));
		System.out.println("60 > 50 is  : " + greater.test(60));
		System.out.println("10 Divisible by 5 : " + d5.test(10));

	}

}
