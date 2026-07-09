package Day24.BuilderPattern;

public class Main {

	public static void main(String[] args) {

		Student student = Student.builder()
                .id(1)
                .name("Saurabh")
                .age(22)
                .build();

        System.out.println(student);

	}

}
