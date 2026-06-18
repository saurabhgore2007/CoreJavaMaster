package Day11.example;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	static String path = "e:/demo/sample.bin";
	static Product prod;

	public static void main(String[] args) {

		int choice;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Create a new Product");
			System.out.println("2. Read all Products");
			System.out.println("3. Exit");
			
			System.out.print("\n Enter choice :");
			choice = scan.nextInt();

			switch(choice) {
			
			case 1:
				try {
					addNewProduct();
				}
				catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			case 2:
				try {
					readAll();
				}
				catch(IOException | ClassNotFoundException | InterruptedException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
	}
	
	public static void addNewProduct() throws IOException{
		File file = new File(path);
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		prod = new Product();
		prod.add();
		
		FileOutputStream fout = new FileOutputStream(file,true);
	    ObjectOutputStream out;

		if(file.length() == 0) {
			out = new ObjectOutputStream(fout);
		}
		else {
			out = new AppendableObjectOutputStream(fout);
		}
		
	    out.writeObject(prod);
	    out.close();
	    fout.close();

	}

	public static void readAll() throws IOException,ClassNotFoundException,InterruptedException{
		File file = new File(path);

		ArrayList<Product> data = new ArrayList<Product>();
		
		FileInputStream fin = new FileInputStream(file);
		ObjectInputStream input = new ObjectInputStream(fin);
		
		try {
			while(true) {
				Product p = (Product)input.readObject();
				data.add(p);
			}
		}
		catch(EOFException  ex)
		{
			System.out.println(ex);
		}
			for(int i=0;i<data.size();i++)
			{
				System.out.println(data.get(i));
			}
			input.close();
	}
}
