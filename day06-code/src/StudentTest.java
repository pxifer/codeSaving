import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> list=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Student s=new Student();
            System.out.println("请输入学生姓名:");
            String name=sc.next();
            System.out.println("请输入学生年龄:");
            int age=sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
