package Day12;


@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}

public class LambdaEx1 {

	public static void main(String[] args) {

		Calculator add = (a,b) -> a+b;
		Calculator sub = (a,b) -> a-b;
		Calculator mult = (a,b) -> a*b;
		Calculator div = (a,b) -> a/b;

	    System.out.println("Addition = " + add.calculate(10, 20));
	    System.out.println("Subtraction = " + sub.calculate(20, 5));
	    System.out.println("Multiplication = " + mult.calculate(10, 5));
	    System.out.println("Division = " + div.calculate(20, 5));

	}

}
