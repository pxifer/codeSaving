package API_paqu;

public class demo7 {
    public static void main(String[] args) {
        //(.)任意字符
        // \\1+重复至少一次

        //  捕获分组
        //   \\组别:正则内部使用
        //    $组别:正则外部使用

        //   (?:)  (?=)   (?!)非捕获分组,仅仅把数据括起来,不占用组别
        String s="我要学学编编编编编编程程程程程程程";
        String regex="(.)\\1+";
        String ret = s.replaceAll(regex, "$1");
        System.out.println(ret);
    }
}
