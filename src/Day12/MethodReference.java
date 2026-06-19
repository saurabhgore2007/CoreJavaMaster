package Day12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class _Student {

    _Student() {
        System.out.println("Object Created");
    }

}

public class MethodReference {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Pune","Mumbai","Delhi","Nagpur");
		
		//Using Lambda
		cities.forEach(city->System.out.println(city));
		
		//Using Method Reference
		cities.forEach(System.out::println);
		
		Function<String,Integer> length = String::length;
		System.out.println(length.apply("Java"));
		
		Function<String,String> upperCase = String::toUpperCase;
		System.out.println(upperCase.apply("java"));
		
		Function<Double,Double> squareRoot = Math::sqrt;
		System.out.println(squareRoot.apply(49.0));


		Supplier<_Student> stud = _Student::new;
		_Student obj = stud.get();
		
		
		//Consumer<String> c = str -> System.out.println(str);
		Consumer<String> c = System.out::println;
		c.accept("Hello");
		
		//Function<String,Integer> f = str -> str.length();
		Function<String,Integer> count = String::length;
		System.out.println(count.apply("Hello World"));
		
		//Function<String,String> lowerCase = str -> str.toLowerCase();
		Function<String,String> lowerCase = String::toLowerCase;
		System.out.println(lowerCase.apply("JAVA"));

		//Function<Double,Double> round = num -> Math.ceil(num);
		Function<Double,Double> round = Math::ceil;
		System.out.println(round.apply(15.51));
		
	}
}
