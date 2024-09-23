package ObjectTemple;

import java.sql.SQLOutput;

public class ObjectDemo1 {

    //toString + equals 对于对象变化的都是地址值
    //需要重写方法比较属性
    public static void main(String[] args) {
        student s=new student("lisi",11);
        student s1=new student("lisi",11);
        student s2=s;

        System.out.println(s);
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

    }
}
