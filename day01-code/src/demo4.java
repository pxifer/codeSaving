import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {11, 22, 33, 44};
        int[] brr = {22, 33, 44};
//        boolean value = equals(arr, brr);
//        if (value == true) {
//            System.out.println("两数组相同");
//        } else {
//            System.out.println("两数组不同");
//        }

//        printarr(arr);

//        System.out.println(getMax(arr));

//        System.out.println("请输入您要寻找的数字:");
//        int index = sc.nextInt();
//       int num=SearchNum(arr,index);
//       if(num==-1){
//           System.out.println("找不到");
//       }
//       else{
//           System.out.println("找到了,下标是"+num);
//       }

//        fill(arr,2,6,520);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请选择头等舱或经济舱");
        String cabin = sc.next();
        System.out.println("请输入机票原价");
        double value = sc.nextDouble();
        System.out.println("机票价格是" + SpendMoney(month, value, cabin));
    }

    //按特殊形式打印数组
    public static void printarr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + " ,");
            }
        }
    }

    //得到数组中的最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //在数组中寻找数字
    public static int SearchNum(int[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (index == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    //判断两数组是否相同
    public static boolean equals(int[] arr1, int[] arr2) {
        int i;
        if (arr1.length == arr2.length) {
            for (i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    break;
                }
            }
            if (i == arr1.length) {
                return true;
            }
        }
        return false;
    }

    //将arr从from到to对应的值改为value
    public static void fill(int[] arr, int from, int to, int value) {
        for (int i = from; i < to; i++) {
            arr[i] = value;
        }
    }

    public static double SpendMoney(int month, double value, String cabin) {
        double money = 0.0;
        if (month >= 5 && month <= 10) {
            money = getMoney(value, cabin, money);
        } else if (month >= 1 && month <= 4 || month >= 11 && month <= 12) {
            money = getMoney(value, cabin, money);
        }else{
            System.out.println("输入月份非法");
        }
        return money;
    }

    public static double getMoney(double value, String cabin, double money) {
        if (cabin == "头等舱")
            money = value * 0.7;
        else if (cabin == "经济舱") {
            money = value * 0.65;
        } else {
            System.out.println("没有此舱位");
        }
        return money;
    }
}
