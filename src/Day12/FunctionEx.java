package Day12;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {

		Function<String,Integer> length = str -> str.length();
		
		System.out.println("String Count : " + length.apply("Java"));
		
		Function<Integer,Integer> square = num -> num*num;

		System.out.println("Square " + square.apply(20));
		
		Function<Double,Double> circleArea = radius -> Math.PI*radius*radius;
		
		System.out.println("Area Of Circle " + circleArea.apply(10d));

		BiFunction<Double,Double,Double> TriangleArea = (base,height) -> 0.5*base*height;
		
		System.out.println("Area Of Triangle " + TriangleArea.apply(10.0,10.0));

	}

}
