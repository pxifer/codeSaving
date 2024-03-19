import java.util.Random;
import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {

////验证码的模拟产生
//        //大小写字母都放在数组中
//        char[] chs = new char[52];
//        for (int i = 0; i < chs.length; i++) {
//            //ASCII表的字符打印
//            //产生大写字母
//            if (i < 26)
//                chs[i] = (char) (65 + i);
//                //产生小写字母
//            else {
//                chs[i] = (char) (97 + i - 26);
//            }
//        }
//        //随车抽取四个字母
//        //通过随机索引来抽取数组中的字母
//        //对抽取的字母进行拼接
//        Random r = new Random();
//        String result="";
//        for(int i=0;i<4;i++){
//            int index = r.nextInt(chs.length);
//            result+=chs[index];
//        }
//        //随机产生一个数字
//        int num=r.nextInt(10);
//        result+=num;
//        System.out.println(result);

//评委打分
//Random r=new Random();
//int[] score=new int[6];
//        for (int i = 0; i < score.length; i++) {
//            score[i]=r.nextInt(101);
//        }
//        int max=score[0];
//        int min=score[0];
//        int sum=0;
//        for (int i = 0; i < score.length; i++) {
//            if(max<score[i]){
//                max=score[i];
//            }
//            if(min>score[i]){
//                min=score[i];
//            }
//        }
//        for (int i = 0; i < score.length; i++) {
//            sum+=score[i];
//        }
//        float avg=(sum-max-min)/score.length-2;
//        System.out.println(avg);

//数字加密
//+5模10反转
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入密码:");
//        int password = sc.nextInt();
//        int count = 0;
//        int tmp = password;
//        while (tmp != 0) {
//            tmp /= 10;
//            count++;
//        }
//        //数字加密
//        //这里的mid的数组也可以直接先反转数字
//        int []mid=new int[count];
//        for (int i = 0; i < mid.length; i++) {
//            mid[i]=password%10;//mid.length-i-1
//            password/=10;
//        }
//        int[] index = new int[count];
//        for (int i = 0; i < index.length; i++) {
//            index[i]=mid[i];
//            index[i] = (index[i] + 5) % 10;//
//        }
//        //数字反转
////        for(int i=0;i<(index.length)/2;i++){
////            int temp=index[i];
////            index[i]=index[index.length-1-i];
////            index[index.length-1-i]=temp;
////        }
//        //密码接收合并
//        int passwordk=0;
//        for (int i = 0; i < index.length; i++) {
//            passwordk=passwordk*10+index[i];
//        }
//        System.out.println(passwordk);

//大V发红包
//1:新建数组,随机抽取,重组数组
//        Random r = new Random();
//        int welfare[] = {2, 588, 888, 1000, 10000};
////抽中红包的顺序数组
//        int[] resultArr = new int[welfare.length];
//        int i = 0;
//        while (i < welfare.length) {
//            int num = r.nextInt(5);
//            int prize = welfare[num];
//            boolean k = check(prize, resultArr);
//            if (k == true) {
//                resultArr[i] = prize;
//                i++;
//            }
//        }
//        for (int i1 = 0; i1 < resultArr.length; i1++) {
//            System.out.print(resultArr[i1] + " ");
//        }

//2:直接打乱数组后遍历奖池
//       int[] welfare={2,588,888,1000,10000};
//       Random r=new Random();
//        for (int i = 0; i < welfare.length; i++) {
//            int index=r.nextInt(5);
//            int tmp=welfare[i];
//            welfare[i]=welfare[index];
//            welfare[index]=tmp;
//        }
//        for (int i = 0; i < welfare.length; i++) {
//            System.out.print(welfare[i]+" ");
//        }

//双色球
//Scanner sc=new Scanner(System.in);
//Random r=new Random();
////随机双色球的号码
//int[] red=new int[6];
//int blue=r.nextInt(16)+1;
//        for (int i = 0; i < red.length; i++) {
//            int index=r.nextInt(33)+1;
//            red[i]=index;
//        }
//        System.out.print("红球号码:");
//        for (int i = 0; i < red.length; i++) {
//            System.out.print(red[i]+" ");
//        }
//        System.out.println("蓝球号码:"+blue);
////开始抽奖
//int [] newRed=new int[6];
//        for (int i = 0; i < red.length;) {
//            System.out.println("请选择红球号码:");
//            int num_red=sc.nextInt();
//            if(num_red>=1&&num_red<=33){
//                newRed[i]=num_red;
//                i++;
//            }
//            else{
//                System.out.println("选择错误,请重新选择:");
//            }
//        }
//        System.out.println("请选择蓝球号码:");
//        int num_blue=sc.nextInt();
////进行奖励判断
//        int redPrize=0;
//        int bluePrize=0;
//        for (int i = 0; i < red.length; i++) {
//            for (int i1 = 0; i1 < newRed.length; i1++) {
//                if(newRed[i1]==red[i]){
//                    redPrize++;
//                    break;
//                }
//            }
//        }
//        if(num_blue==blue){
//            bluePrize++;
//        }
////奖励数额发放判定
//        int prize=0;
//if(redPrize<=2&&bluePrize==1){
//    prize=5;
//}
//if(redPrize==4&&bluePrize==0||redPrize==3&&bluePrize==1){
//    prize=10;
//}
//if((redPrize==5&&bluePrize==0)||(redPrize==4&&bluePrize==1)){
//    prize=200;
//}
//if(redPrize==5&&bluePrize==1){
//    prize=3000;
//}
//if(redPrize==6&&bluePrize==0){
//    prize=500000;
//}
//if(redPrize==6&&bluePrize==1){
//    prize=1000000;
//}
//        System.out.println("奖金是:"+prize);

//二维数组的创建和数据储存
//        int yearArrArr[][] = {
//                {22, 24, 42},
//                {15, 35, 63},
//                {25, 35, 63},
//                {12, 45, 67}
//        };
//        int yearSum = 0;
//        for (int i = 0; i < yearArrArr.length; i++) {
//            int sum = getSum(yearArrArr[i]);
//            System.out.println("第" + (i + 1) + "个季度的营业额为" + sum + "万元");
//            yearSum += sum;
//        }
//        System.out.println("该年的总营业额为" + yearSum + "万元");


    }

    public static boolean check(int prize, int[] welfare) {
        for (int i = 0; i < welfare.length; i++) {
            if (prize == welfare[i]) {
                return false;
            }
        }
        return true;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
