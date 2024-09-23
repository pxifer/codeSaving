package Regex;

public class demo1 {
    public static void main(String[] args) {
        //邮箱:123_dag@itcast.com.cn
        //  [\\w+@[//w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}
        String regex="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("123_dag@itcast.com.cn".matches(regex));
        String usernameRegex="\\w{4.16}";
        String idcode="12345678901234567x";
        String idcodeRegex="[1-9]\\d{16}[\\dxX]";
        //[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|x|X)
    }
}
