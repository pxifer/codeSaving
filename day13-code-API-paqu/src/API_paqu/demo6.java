package API_paqu;

public class demo6 {
    public static void main(String[] args) {
        //.任意字符
        //捕获对象--以(为准
        //重复捕获
        //a123a &abc& a123b
        String regex1="(.)\\w+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));
        System.out.println("==================");

        //abc123abc &1abc&1 abc123aac
        String regex2="(.+)\\w+\\1";
        System.out.println("abc123abca".matches(regex2));
        System.out.println("&1abc&1".matches(regex2));
        System.out.println("abc123aac".matches(regex2));
        System.out.println("==================");


        //aaa123aaa bbb123bbb aa12ab
        String regex3="((.)\\2+)\\w+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb123bbb".matches(regex3));
        System.out.println("aa12ab".matches(regex3));
    }
}
