import java.util.Scanner;

public class CapitalNumber {
    public static void main(String[] args) {
        //数字转文字金额
        Scanner sc = new Scanner(System.in);
        //输入金额
        System.out.println("请输入金额:");
        int money;
        while (true) {
            money = sc.nextInt();
            if (money >= 0 && money < 9999999) {
                break;
            } else {
                System.out.println("金额异常");
            }
        }
        String ret=getString(money);
        System.out.println(ret);
    }

    public static String getString(int money) {
        //数字拆分
        //result字符串数组记录
        String result = "";
        while (money != 0) {
            String c = getCapitalNumber(money % 10);
            money /= 10;
            result = c + result;
        }
        //前位补零
        int count = 7 - result.length();
        for (int i = 0; i < count; i++) {
            result = "零" + result;
        }
        //插空补全
        String ret = "";
        String[] str = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < result.length(); i++) {
            ret = ret + result.charAt(i) + str[i];
        }
        return ret;
    }

    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
