public class Stringdemo7 {
    public static void main(String[] args) {
        //链式编程
        //使用方法时不需要接收结果,直接继续调用方法
        String str="abc";
        int len=str.replace("a","*").substring(1).length();
        System.out.println(len);
        StringBuilder sb=new StringBuilder();
        sb.append("aaa").append("bbb").append("ccc");
        System.out.println(sb);
    }
}
