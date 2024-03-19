import java.util.Scanner;

public class LastWordLen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入英语句子:");
        //nextLine是输入整行,next输入遇见空格截止
        String s=sc.nextLine();
        int len=wordCheck(s);
        System.out.println(len);
    }
    public static int wordCheck(String s){
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return count;
            }else{
                count++;
            }
        }
        return count;
    }
}
