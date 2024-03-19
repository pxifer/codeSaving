import java.util.Scanner;

public class RomaNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字字符串:");
            String str = sc.next();
            boolean ret = checkString(str);
            if (ret == false) {
                System.out.println("请重新输入");
                continue;
            } else {
                StringBuilder sb=new StringBuilder();
                String[] arr = {"", "|", "||", "|||", "|V", "V", "V|", "V||", "V|||", "V||||"};
                for (int i = 0; i < str.length(); i++) {
                    sb.append(arr[str.charAt(i) - '0']);
                }
                System.out.println(sb);
                break;
            }
        }

    }

    public static boolean checkString(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
