package Day12;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {

		Random random = new Random();

		Supplier<Integer> otp=()->100000 + random.nextInt(900000);
		
		for(int i=0;i<5;i++) {
			System.out.println(otp.get());
		}
	}
}
