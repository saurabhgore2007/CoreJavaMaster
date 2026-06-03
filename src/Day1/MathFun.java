package Day1;

public class MathFun {

	public static void main(String[] args) {

		int num1 = 10 ,num2 = 5;
		
		System.out.println("````Mathematical Functions````");

//		1.Math.max(x,y)
		System.out.println("Maximum Number From " + num1 + " and " + num2 +  " is " + Math.max(num1, num2));

//		2.Math.min(x,y)
		System.out.println("Minimum Number From " + num1 + " and " + num2 +  " is " + Math.min(num1, num2)+ "\n");

//		3.Math.sqrt(x,y)
		System.out.println("Square root of  " + num1 + " is : " + Math.sqrt(num1));
		System.out.println("Square root of  " + num1 + " is : " + Math.sqrt(num2)+ "\n");

//		4.Math.abs(x)
		System.out.println("Absolute of 10.29 is "+ Math.abs(-10.29));

//		5.Math.pow(x, y)
		System.out.println("2 ^ 8 is "+ Math.pow(2, 8) + "\n");

//		6.Math.round(x)
		System.out.println("Round 4.7 is "+ Math.round(4.7));
		System.out.println("Round 4.7 is "+ Math.round(4.3) + "\n");

		
//		7.Math.ceil(x)
		System.out.println("Ceil 4.1 is "+ Math.ceil(4.1));
		
//		8.Math.floor(x)
		System.out.println("Ceil 4.9 is "+ Math.floor(4.9));

//		9.Math.random();
		System.out.println("Random number is "+ Math.random());

//		10.Math.PI();
		System.out.println("Value of PI is "+ Math.PI );
		
//		11.Math.E();
		System.out.println("Value of PI is "+ Math.E );
	}

}
