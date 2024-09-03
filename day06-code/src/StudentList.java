import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student s1=new Student("zhangsan",15);
        Student s2=new Student("lisi",16);
        Student s3=new Student("wangwu",17);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
