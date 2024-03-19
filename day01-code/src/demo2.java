import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//数的阶乘和
//        int i;
//        int m=1;
//        int sum=0;
//        System.out.println("请输入阶乘数:");
//        int n=sc.nextInt();
//        for(i=1;i<=n;i++)
//        {
//            m*=i;
//            sum+=m;
//        }
//        System.out.println(sum);

//辗转相除法求最大公因数
//        System.out.println("请输入被除数:");
//        int m=sc.nextInt();
//        System.out.println("请输入除数:");
//        int n=sc.nextInt();
//        int r=m%n;
//        while(r==0){
//            n=r;
//            m=n;
//            r=m%n;
//        }
//        System.out.println(m+"与"+n+"的最大公因数为"+r);

//求闰年的时间和次数
//        int year;
//        int count=0;
//        for(year=1000;year<2000;year+=4){
//            if(year%4==0&&year%100!=0||year%400==0){
//                System.out.println(year);
//                count++;
//            }
//        }
//        System.out.println('\n');
//        System.out.println(count);

//计算素数个数,并且打印素数
//        int i,n;
//        int count=0;
//        for(n=100;n<200;n++){
//            for(i=2;i<=sqrt(n);i++){
//                if(n%i==0){
//                    break;
//                }
//            }
//            if(i>sqrt(n)){
//                System.out.println(n);
//                count++;
//            }
//        }
//        System.out.println(count);

//求分数和
//int i;
//int flag=1;
//double sum=0.0;
//for(i=1;i<100;i++){
//    sum+=flag*1.0/i;
//    flag=-flag;
//}
//        System.out.println(sum);

//纸折珠穆朗玛峰
//        int count = 0;
//        double thin = 0.1;
//        while (thin < 8844430) {
//            thin *= 2;
//            count++;
//        }
//        System.out.println(count);

//确认回文数
//        int n=sc.nextInt();
//        int sum=0;
//        int k=n;
//        while(n!=0){
//            sum=sum*10+n%10;
//            n/=10;
//        }
//        if(sum==k){
//            System.out.println(k+"是回文数");
//        }
//        else
//            System.out.println(k+"不是回文数");

//求商和余数
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int count = 0;
//        while (n >= m) {
//            n -= m;
//            count++;
//        }
//        System.out.println("余数是" + n + "商是" + count);

//打印平方根整数
//        int n = sc.nextInt();
//        int i = 1;
//        if (n <= 0) {
//            System.out.println("error");
//        } else {
//
//            while (i * i <= n) {
//                i++;
//            }
//            System.out.println("n的平方根整数为" + (i - 1));
//        }

//经典猜数字
        //生成随机数
//        Random r=new Random();
//        int num=r.nextInt(100)+1;
//        //猜数字,比大小
//       while(true){
//           int guess=sc.nextInt();
//           if(num>guess){
//               System.out.println("猜小了");
//           }
//           else if(num<guess){
//               System.out.println("猜大了");
//           }
//           else{
//               System.out.println("猜对了");
//               break;
//           }
//       }

//二分法
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int k = 10;
//        int left = 0;
//        int right = arr.length - 1;
//        int mid = (left + right) / 2;
//
//        while (right >= left) {
//            if (arr[mid] > k) {
//                right = mid - 1;
//                mid = (left + right) / 2;
//            } else if (arr[mid] < k) {
//                left = mid + 1;
//                mid = (left + right) / 2;
//            } else if (arr[mid] == k) {
//                System.out.println("找到了,下标是" + mid);
//                break;
//            }
//        }
//        if (left > right) {
//            System.out.println("找不到");
//        }

//向中浮动打印
        String arr1 = "welcome*to*dalian*maritime*university!!!";
        char[] arr1k=arr1.toCharArray();
        String arr2 = "########################################";
        char[] arr2k=arr2.toCharArray();
        int len=arr2.length();
        int left = 0;
        int right = len-1;
        while (right >= left) {
            arr2k[left] = arr1k[left];
            arr2k[right] = arr1k[right];
            left++;
            right--;
//            String s=new String(arr1);
            for (int i = 0; i < arr2k.length; i++) {
                System.out.print(arr2k[i]);
            }
            System.out.println();
        }
    }
}
