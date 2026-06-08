package Day8;

public class ExceptionEx3 {

	public static float answer[] = new float[1];
	public static int i;

	public static void main(String[] args) {
		Object arr[] =  {11,13, "hello", false, 17.98, 'a', 100};
		
		for(int i=0;i<arr.length;i++)
		{
			storeNumber(arr[i]);
		}
		
		System.out.println(answer[0]);

	}
	
	public static void storeNumber(Object data)
	{
		try
		{
			int no = (int)data;
			divide(no,no%2);
		}
		catch(ClassCastException ex)
		{
			System.out.println("Value is " + data + ": cant cast to type int");
		}
	}
	
	public static void divide(int number, int d)
	{
		try {
			save(number/d);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("number = " + number + " cant be divide by zero");
		}
	}
	
	public static void save(float data)
	{
		try
		{
			answer[i] = data;
			
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("answer array overflow");
		}
	}


}
