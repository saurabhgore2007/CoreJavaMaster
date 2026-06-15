package Day10;

import java.util.Scanner;
import java.util.Vector;

class Employee_
{
	public int id;
	public String name;
	public double salary;

	public Employee_(){}

	public Employee_(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
			return String.format("%10d %20s %10.2f", this.id, this.name, this.salary);
	}
}


public class VectorEx1 {

	public static void main(String[] args) {

		Vector<Employee_> v1 = new Vector<Employee_>();

		v1.addElement(new Employee_(834, "Smith", 80000));
		v1.addElement(new Employee_(891, "James", 78000));
		v1.addElement(new Employee_(188, "Peter", 67000));

		for(Employee_ item:v1)
		{
			System.out.println(item);
		}

		Scanner scan = new Scanner(System.in);
		String _empName;
		int pos = -1;

		System.out.print("Enter name to delete :");
		_empName = scan.next();

		for(int i=0;i<v1.size();i++)
		{
			if(v1.elementAt(i).name.equalsIgnoreCase(_empName))
				pos=i;
		}

		if(pos==-1)
		{
			System.out.println(_empName + " not exist in collection");
		}
		else
		{
			v1.removeElement(v1.elementAt(pos));
			System.out.println(_empName + " successfully removed from collection");
			System.out.println(v1);
			System.out.println("\nUpdated List ");
			for(Employee_ item:v1)
			{
				System.out.println(item);
			}
		}

		scan.close();
	}

}
