import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //创建集合对象
        //泛型: 指明集合中元素的类型
        ArrayList<User> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        User u1=new User("01","zhangsan","1234");
        User u2=new User("02","lise","12345");
        User u3=new User("03","wangwu","1234645");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println("请输入需要查询的id:");
        String id=sc.next();
        boolean ret=checkId(id,list);
        System.out.println(ret);
    }
    public static boolean checkId(String id,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id))
                return true;
        }
        return false;
    }
}