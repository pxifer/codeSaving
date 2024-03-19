public class Stringdemo1 {
    public static void main(String[] args) {
//        String s1="abc";
//        System.out.println(s1);
//        String s2=new String();
//        System.out.println("!"+s2+"!");
//        String s3=new String("abc");
//        System.out.println(s3);
//        char[] chs={'a','b','c','d'};
//        String s4=new String(chs);
//        System.out.println(s4);
//        byte[] bytes={65,66,67,68};
//        String s5=new String(bytes);
//        System.out.println(s5);

        //基本类型比较数据值
        //引用类型比较地址值
        String s1="abc";
        String s2=new String("Abc");
        //比较地址值
        System.out.println(s1==s2);
        //区分大小写比较字符串
        System.out.println(s1.equals(s2));
        //不区分大小写比较字符串
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
