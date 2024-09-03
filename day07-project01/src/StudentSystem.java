import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystem {
    private static final String Add_STUDENT="1";
    private static final String REMOVE_STUDENT="2";
    private static final String MODIFY_STUDENT="3";
    private static final String SHOW_STUDENT="4";
    private static final String EXIT="5";
   static ArrayList<Student> list = new ArrayList<>();
   static{
       list.add(new Student("001","zhangsan",18,"beijing"));
       list.add(new Student("002","lisi",19,"sichuang"));
   }
    public static void startStudentSystem() {
        Scanner sc = new Scanner(System.in);

        String flag;
        loop:
        do {
            menu();
            System.out.println("请输入您的选择:");
            //用String进行next()接收,增加容错率
            flag = sc.next();
            switch (flag) {
                case Add_STUDENT:
                    add(list);
                    break;
                case REMOVE_STUDENT:
                    remove(list);
                    break;
                case MODIFY_STUDENT:
                    modify(list);
                    break;
                case SHOW_STUDENT:
                    show(list);
                    break;
                case EXIT:
                    System.out.println("退出");//第三种方法:system.exit(0)--停止虚拟机
                    break loop;//第一种退出方法:指定跳出循环法  loop: while(true){switch()caee 1: break loop;};
                default:
                    System.out.println("选择错误,请重新选择");
                    break;
            }
        } while (true);//第一种退出方法:判断法: (flag.equals("5"))

    }

    //菜单界面
    public static void menu() {
        System.out.println("---------欢迎来到黑马管理系统---------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");
    }

    //检查ID的唯一性
    public static int idCheck(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            //返回false代表集合中ID已经存在
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    //添加学生信息
    public static void add(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //创建学生对象
        Student s = new Student();
        //将输入的信息储存在学生对象中
        System.out.println("请输入学生的ID:");
        s.setId(sc.next());

        if (idCheck(s.getId(), list) == -1) {
            System.out.println("请输入学生的姓名:");
            s.setName(sc.next());
            System.out.println("请输入学生的年龄:");
            s.setAge(sc.nextInt());
            System.out.println("请输入学生的家庭住址:");
            s.setAddress(sc.next());
            list.add(s);
            System.out.println("学生信息添加成功");
        } else {
            System.out.println("该学生ID已存在");
        }
    }

    public static void remove(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的ID:");
        String id = sc.next();
        int index = idCheck(id, list);
        if (index != -1) {
            //进行删除操作
            list.remove(index);
        } else {
            System.out.println("该学生ID不存在");
        }
    }

    //学生信息修改
    public static void modify(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的ID:");
        String id = sc.next();
        int index = idCheck(id, list);
        if (index != -1) {
            System.out.println("请修改学生的姓名:");
            list.get(index).setName(sc.next());
            System.out.println("请修改学生的年龄:");
            list.get(index).setAge(sc.nextInt());
            System.out.println("请修改学生的家庭住址:");
            list.get(index).setAddress(sc.next());
            System.out.println("学生信息修改成功");
        }
    }

    //学生信息打印
    public static void show(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("当前无学生信息,请添加后查询");
        } else {
            System.out.printf("%-10s\t%-10s\t%-10s\t%-10s", "id", "姓名", "年龄", "家庭住址");
            System.out.println();
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%-10s\t%-10s\t%-10s\t%-10s",
                        list.get(i).getId(),
                        list.get(i).getName(),
                        list.get(i).getAge(),
                        list.get(i).getAddress());
                System.out.println();
            }
        }
    }
}