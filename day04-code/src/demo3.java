import java.util.Scanner;

public class demo3 {
    //StringBuilder的使用场景
    //1.拼接字符串
    //2.字符串反转
    public static void main(String[] args) {
        //判断字符串是否对称
        System.out.println("请输入字符串:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //创建对象进行字符串反转
       String ret=new StringBuilder().append(str).reverse().toString();
        if(str.equals(ret)){
            System.out.println("该字符串是对称的");
        }else{
            System.out.println("该字符串不是对称的");
        }
    }
}
