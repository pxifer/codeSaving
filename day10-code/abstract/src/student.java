public class student extends Person{
    public student() {
    }

    public student(String name, int age) {
        super(name, age);
    }
    @Override
    public void work() {
        System.out.println("学生的任务是学习");
    }
}
