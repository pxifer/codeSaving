package Objects;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        method_01();
        method_02();
        method_03();
    }

    public static void method_01() {
        student s1 = new student("lisi", 15);
        //objects就是对object的toString进行了地址非空判断
        String result = Objects.toString(s1);
        System.out.println(result);
    }

    public static void method_02() {
        student s1 = new student("lisi", 15);
        student s2 = new student("lisi", 15);
        //非空判断,属性比较仍需重写object的equals
        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
    }

    public static void method_03() {
        student s1 = new student("lisi", 15);
        boolean result = Objects.isNull(s1);
        boolean result2=Objects.nonNull(s1);

    }
}
