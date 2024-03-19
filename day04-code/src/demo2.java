import java.util.Scanner;
import java.util.SortedMap;

public class demo2 {
    public static void main(String[] args) {
        //遍历字符串
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串:");
//        String str = sc.next();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            System.out.println(c);

//记录小写与大写与数字字符个数
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串:");
//        String str = sc.next();
//        int smallCounter = 0;
//        int bigCounter = 0;
//        int numberCounter = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                smallCounter++;
//            } else if (c >= 'A' && c <= 'Z') {
//                bigCounter++;
//            } else if (c >= '0' && c <= '9') {
//                numberCounter++;
//            }
//        }
//        System.out.println("小写字母有" + smallCounter + "个");
//        System.out.println("大写字母有" + bigCounter + "个");
//        System.out.println("数字字符有" + numberCounter + "个");

        int[] arr={1,2,3};
        String result=arrtoString(arr);
        System.out.println(result);

       String ret= reserve("abc");
        System.out.println(ret);

    }

    //将数组以特定方式打印
    public static String arrtoString(int[] arr){
        if(arr==null){
            return "";
        }
    String result="[";
        for (int i = 0; i < arr.length; i++) {
           if(i==arr.length-1){
               result=result+arr[i];
           }else{
               result=result+arr[i]+",";
           }
        }
        result+="]";
        return result;
    }
    public static String reserve(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}