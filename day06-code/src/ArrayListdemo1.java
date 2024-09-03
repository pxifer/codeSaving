import java.util.ArrayList;
import java.util.ArrayList;

public class ArrayListdemo1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list=new ArrayList<String>();
        //添加元素
        list.add("apple");
        list.add("banana");
        boolean ret=list.add("orange");
        System.out.println(ret);
        //删除
        String str=list.remove(1);
        System.out.println(str);
        System.out.println(list);
        //修改
        String res=list.set(1,"bbb");
        System.out.println(res);
        System.out.println(list);
        //查询+遍历
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            System.out.println(s);
        }

    }
}
