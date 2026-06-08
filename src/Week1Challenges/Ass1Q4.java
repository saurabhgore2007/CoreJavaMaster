package Week1Challenges;

import java.util.Scanner;

/*Input population of Town and calculate Total Literacy, Literate Men, Literate Women, Illiterate 
Men, Illiterate women as per following conditions. 
1. Percentage of men = 52% 
2. Percentage of literacy = 48% 
3. Percentage of literate men = 35%*/

public class Ass1Q4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int population,totalLit,literateMen,literateWomen,illLiterateMen,illLiterateWomen;
						
		System.out.print("Enter Population :- ");
		population = scan.nextInt();
		
		totalLit = (int)(population*0.48);
		literateMen = (int)(totalLit*0.35);
		literateWomen = totalLit-literateMen;
		
		int totalMen = (int)(population*0.52);
		int totalWomen = population - totalMen;
		
		illLiterateMen = totalMen-literateMen;
		illLiterateWomen = totalWomen-literateWomen;

		System.out.println("Total Literacy : " + totalLit);
		System.out.println("Total Literate Men : " + literateMen);
		System.out.println("Total Literate Women : " + literateWomen);
		System.out.println("Total Illiterate Men : " + illLiterateMen);
		System.out.println("Total Illiterate women : " + illLiterateWomen);
	
		scan.close();
	}

}
