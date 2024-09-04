public class studentTest {
    public static void main(String[] args) {
        student str = new student();
        student.teacherName = "狂徒";
        str.name = "张三";
        str.age = 18;
        str.gender = "男";
        str.sleep();
        str.eat();
        str.print();
        student s = new student();
        s.name = "李四";
        s.age = 16;
        s.gender = "女";
        s.sleep();
        s.eat();
        s.print();
    }
}
