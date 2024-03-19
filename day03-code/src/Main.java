//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 19);
        Student stu3 = new Student(3, "王五", 20);

//        arr[0] = stu1;
//        arr[1] = stu2;
//        arr[2] = stu3;
//增加学生对象
        //数组中再添加一个学生对象
        Student stu4 = new Student(4, "赵烈", 23);
        //判断唯一性id
        //返回true则是已存在,false为不存在
//        boolean result = Check(arr, stu4.getId());
//        if (result) {
//            System.out.println("该学生id已存在,请修改id重新录入");
//        } else {
//            //判断数组是否已存满
//            int count = getCount(arr);
//            //分类讨论
//            if (count < arr.length) {
//                arr[count] = stu4;
//                Show(arr);
//            } else {
//                //创建新数组
//                System.out.println("数组已存满,创建新数组");
//                Student[] newArr = Creat(arr, stu4);
//                Show(newArr);
//            }
        }
    }
