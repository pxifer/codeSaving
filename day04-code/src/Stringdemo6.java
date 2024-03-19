public class Stringdemo6 {
    public static void main(String[] args) {
       //创建对象:StringBuilder容器
        StringBuilder sb=new StringBuilder();
        //append:对内容在StringBuilder容器内拼接
//        sb.append(1);
//        sb.append(2.2);
//        sb.append(true);
        sb.append("abc");
        //reverse:对容器内容进行反转
        sb.reverse();
        //length():计算容器内的字符数
        int len = sb.length();
        //toString:将容器内的内容转化为字符串
        sb.toString();
        System.out.println(sb);
        System.out.println(len);
        System.out.println(sb);
    }
}
