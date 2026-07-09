package Day24.BuilderPattern;

public class Student {

    private int id;
    private String name;
    private int age;

    private Student(StudentBuilder builder) {

        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;

    }

    public static StudentBuilder builder() {

        return new StudentBuilder();

    }

    @Override
    public String toString() {

        return id + " " + name + " " + age;

    }

    public static class StudentBuilder {

        private int id;
        private String name;
        private int age;

        public StudentBuilder id(int id) {

            this.id = id;
            return this;

        }

        public StudentBuilder name(String name) {

            this.name = name;
            return this;

        }

        public StudentBuilder age(int age) {

            this.age = age;
            return this;

        }

        public Student build() {

            return new Student(this);

        }

    }

}