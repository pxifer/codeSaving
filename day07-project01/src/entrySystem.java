import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class entrySystem {
    private static final String LOGIN="1";
    private static final String REGISTER="2";
    private static final String FORGET_PASSWORD="3";
    private static final String EXIT="4";
    static ArrayList<user> userlist = new ArrayList<>();
    static{
        userlist.add(new user("zhangsan","6","123456789012345678","12345678901"));
        userlist.add(new user("pxifer","6","123456789012345679","12345678909"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            entryMenu();
            String choose = sc.next();
            switch (choose) {
                case LOGIN:
                    entry(userlist);
                    break;
                case REGISTER:
                    register(userlist);
                    break;
                case FORGET_PASSWORD:
                    forgetPassword(userlist);
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("选择错误,请重新选择");
                    break;
            }
        }
    }

    //用户登录界面
    public static void entryMenu() {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作:1.登录 2.注册 3.忘记密码 4.退出");
    }

    //进行用户名唯一性判断
    //加强for循环
    public static boolean onlyUsername(ArrayList<user> userlist, String username) {
        for (user u:userlist) {
            if (u.getUername().equals(username)) {
                //返回false:代表用户名已存在
                return false;
            }
        }
        return true;
    }

    //进行用户名的要求验证
    public static boolean usernameCheck(String username) {
        int len = username.length();
        if (len < 3 || len > 15) {
            System.out.println("用户名长度须在3~15位");
            System.out.println("请重新输入:");
            return false;
        } else if (!groupJudge(username)) {
            System.out.println("用户名只能数字加字母,但不能是纯数字");
            System.out.println("请重新输入:");
            return false;
        } else {
            System.out.println("用户名成功输入");
            return true;
        }
    }

    //进行用户名的要求验证(数字与字母组合)
    public static boolean groupJudge(String username) {
        int lettercount = 0;
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!(ch >= '0' && ch <= '9' || ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')) {
                return false;
            }
            if (ch > '9') {
                lettercount++;
            }
        }
        return lettercount > 0;
    }

    //进行身份证号码的要求验证
    public static boolean idcardCheck(String idcard) {
        if (idcard.length() != 18) {
            return false;
        }
        if (idcard.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < idcard.length() - 1; i++) {
            char c = idcard.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        char endChar = idcard.charAt(idcard.length() - 1);
        if (endChar >= '0' && endChar <= '9' || endChar == 'x' || endChar == 'X') {
            return true;
        } else {
            return false;
        }
    }

    //进行手机号码验证
    public static boolean phoneNumCheck(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    //用户的注册操作
    public static void register(ArrayList<user> userlist) {
        Scanner sc = new Scanner(System.in);
        //用户名的输入注册
        String username;
        while (true) {
            boolean res;
            boolean res1;
            System.out.println("请输入用户名:");
            username = sc.next();
            res = usernameCheck(username);
            if (!res) {
                System.out.println("格式有误,请重新输入");
                continue;
            }
            res1 = onlyUsername(userlist, username);
            if (!res1) {
                System.out.println("用户名" + username + "已存在,请重新输入");
            } else {
                System.out.println(username + "可用");
                break;
            }
        }
        //密码的输入注册
        String password;
        while (true) {
            System.out.println("请输入密码:");
            password = sc.next();
            System.out.println("请再次输入密码:");
            String passwordAgain = sc.next();
            if (!password.equals(passwordAgain)) {
                System.out.println("两次密码不同,请重新输入密码");
            } else {
                System.out.println("两次密码一致,录用成功");
                break;
            }
        }
        //身份证号码验证
        String idcard;
        while (true) {
            System.out.println("请输入身份证号:");
            idcard = sc.next();
            boolean res = idcardCheck(idcard);
            if (!res) {
                System.out.println("身份证号输入错误,请重新输入");
            } else {
                System.out.println("身份证号输入成功");
                break;
            }
        }
        //手机号验证
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号:");
            phoneNumber = sc.next();
            boolean res = phoneNumCheck(phoneNumber);
            if (!res) {
                System.out.println("手机号输入错误,请重新输入");
            } else {
                System.out.println("手机号输入成功");
                break;
            }
        }
        user u=new user(username,password,idcard,phoneNumber);
        System.out.println("注册成功");
        userlist.add(u);
    }

    //验证码产生
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) (i + 'a'));
            list.add((char) (i + 'A'));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            sb.append(list.get(index));
        }
        sb.append(r.nextInt(10));
        char[] arr = sb.toString().toCharArray();
        int k = r.nextInt(5);
        char tmp = arr[k];
        arr[k] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;
        return new String(arr);
    }

    public static boolean checkUserinfo(ArrayList<user> userlist, user userinfo) {
        for (user u:userlist) {
            if (u.getUername().equals(userinfo.getUername()) && u.getPassword().equals(userinfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    //登录操作
    public static void entry(ArrayList<user> userlist) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            boolean ret = onlyUsername(userlist, username);

            if (ret) {
                System.out.println("用户未注册,请先注册");
                return;
            }

            System.out.println("请输入密码");
            String password = sc.next();
            //产生验证码

            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确验证码为" + rightCode);
                System.out.println("请输入验证码:");
                String code = sc.next();
                if (rightCode.equalsIgnoreCase(code)) {
                    System.out.println("验证正确");
                    break;
                } else {
                    System.out.println("验证错误");
                }
            }
            //用户名与密码检索
            user userinfo = new user(username, password, null, null);
            boolean result = checkUserinfo(userlist, userinfo);
            if (result) {
                System.out.println("登录成功,可以进入学生管理系统");
                //创建对象
                StudentSystem.startStudentSystem();
                break;
            } else {
                System.out.println("登录失败,用户名或密码错误");
                if (i == 2) {
                    System.out.println("当前账号" + username + "被锁定,请联系xxx");
                } else {
                    System.out.println("您还有" + (2 - i) + "次机会");
                }
            }
        }
    }

    //检查集合中是否存在该用户名,存在则返回i
    public static int searchName(ArrayList<user> user, String username) {
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getUername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    //忘记密码
    public static void forgetPassword(ArrayList<user> userlist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.next();
        int index=searchName(userlist, username);
        if ( index== -1) {
            System.out.println("未注册");
            return;
        }
        System.out.println("请输入身份证号码:");
        String idcard = sc.next();
        System.out.println("请输入手机号码:");
        String phoneNumber = sc.next();
        if (!(userlist.get(index).getIdcard().equals(idcard)&&userlist.get(index).getPhonenumber().equals(phoneNumber))) {
            System.out.println("账号信息不匹配,修改失败");
            return;
        }

        while (true) {
            System.out.println("请输入新的密码:");
            String password=sc.next();
            System.out.println("请再次输入密码:");
            String passwordAgain=sc.next();
            if(password.equals(passwordAgain)){
                System.out.println("两次密码输入一致");
                userlist.get(index).setPassword(password);
                break;
            }else{
                System.out.println("两次密码输入不一致,请重新输入");

            }
        }
    }
}
