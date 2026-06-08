package Week1Challenges;

//WAP to Display the even numbers between 1 to 100 and Odd numbers between 101 to 200. 

public class Ass1Q7 {

	public static void main(String[] args) {

		System.out.println("Even numbers between 1 to 100 :");
		for(int i = 1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+",");
			}
		}
		
		System.out.println("\nOdd numbers between 1 to 100 :");
		for(int i = 101;i<=200;i++) {
			if(i%2!=0) {
				System.out.print(i+",");
			}
		}
	}

}
