package Day11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOPackageEx2 {

	public static void main(String[] args) throws IOException{

		String _fileName = "e:/demo/";
		String message;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter File Name to Create");
		_fileName += scan.next() + ".txt";
		
		File file = new File(_fileName);
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("Created File Successfully");
		}
		else{ 
		   System.out.println("\nFile Already exists"); 
		} 
		
		PrintWriter pw = new PrintWriter(file);

		System.out.println("Enter message = ");
		scan.nextLine();	
		message = scan.nextLine(); 
		
		pw.write(message);
		
		pw.close();
		
		
	}

}
