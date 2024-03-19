import java.util.Scanner;

public class demo1 {
    //用户登录系统
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号" + username + "已被锁定,请24小时后再次尝试或联系客服XXX");
                } else {
                    System.out.println("用户登录失败,用户名或账号密码错误,您还剩下" + (2 - i) + "次机会");

                }
            }
        }
    }
}
