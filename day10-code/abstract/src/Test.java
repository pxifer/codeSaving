public class Test {
    public static void main(String[] args) {
        student stu=new student("zhangsan",23);
        System.out.println(stu.getName() +","+stu.getAge());
        stu.work();
    }
}
