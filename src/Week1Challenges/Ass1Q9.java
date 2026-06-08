package Week1Challenges;

import java.util.Scanner;

/*Write a menu driven program to perform 1. Add Employee 2. Calculate Gross Salary 3. Display 
Details. In this program you should take  
a. DA = 15%, b. HRA = 16% c. CCA = 21%. 
*/

class Employee {
    private int empNo;
    private String empName;
    private float basicSalary;
    private float grossSalary;

    public void setEmployee(int empNo, String empName, float basicSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public void calculateGross() {
        float DA = basicSalary * 0.15f;  
        float HRA = basicSalary * 0.16f; 
        float CCA = basicSalary * 0.21f; 
        grossSalary = basicSalary + DA + HRA + CCA;
    }

    public void display() {
        System.out.println("Employee No   : " + empNo);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Gross Salary  : " + grossSalary);
    }
}

public class Ass1Q9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[10];
        int count = -1;
        int choice;

        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Calculate Gross Salary");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                	count++;
                    System.out.print("Enter Employee No: ");
                    int no = sc.nextInt();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.next();
                    System.out.print("Enter Basic Salary: ");
                    float basic = sc.nextFloat();
                    emp[count].setEmployee(no, name, basic);
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                	if(count<=-1) {
                		System.out.println("There is No record");
                	}else {
                    emp[count].calculateGross();
                    System.out.println("Gross Salary Calculated!");
                	}
                    break;

                case 3:
                	if(count<=-1) {
                		System.out.println("There is No record to Display.");
                	}else {
                    emp[count].display();
                	}
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 4);
        
        sc.close();
    }

}
