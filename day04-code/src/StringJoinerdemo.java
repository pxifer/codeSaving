import java.util.StringJoiner;

public class StringJoinerdemo {
    public static void main(String[] args) {
        //创建对象并指定中间间隔
        StringJoiner sj=new StringJoiner("---","[","]");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc").toString();
        System.out.println(sj);

    }
}
