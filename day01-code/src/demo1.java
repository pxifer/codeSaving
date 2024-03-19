import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number=4;
//        switch(number){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println("不存在");
//        }

        //jdk12提出的新特性:
//        int number=1;
//        switch (number) {
//            case 1 -> System.out.println("一");
//            case 2 -> System.out.println("二");
//            case 3 -> System.out.println("三");
//            default -> System.out.println("错误");
//        }
        int week=sc.nextInt();
switch(week){
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        System.out.println("工作日");
        break;
    case 6:
    case 7:
        System.out.println("休息日");
    default:
        System.out.println("没有这个星期");
}
    }
}
