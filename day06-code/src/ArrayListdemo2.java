import java.util.ArrayList;

public class ArrayListdemo2 {
    public static void main(String[] args) {
        //String:字符串
//        //创建集合对象
//        ArrayList<String> list=new ArrayList<>();
//        //添加元素
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        System.out.println(list);

//        //list.size()
//        //Integer:int类型数字
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//            if (list.size() - 1 == i) {
//                System.out.print(list.get(i));
//            } else {
//                System.out.print(list.get(i) + ",");
//            }
//        }
//        System.out.println("]");

        //Character:字符
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        System.out.println(list);
    }
}
