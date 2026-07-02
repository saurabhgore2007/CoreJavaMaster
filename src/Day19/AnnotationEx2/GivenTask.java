package Day19.AnnotationEx2;

class GivenTask {

	public GivenTask() {}
    @Execute
    public void task1() {
        System.out.println("Task 1 Executed");
    }

    public void task2() {
        System.out.println("Task 2 Executed");
    }

    @Execute
    public void task3() {
        System.out.println("Task 3 Executed");
    }

}
