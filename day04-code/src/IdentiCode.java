import java.util.Random;

public class IdentiCode {
    //5位验证码的生成,其中数字随机
    public static void main(String[] args) {
        char[] chs=new char[52];
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < chs.length; i++) {
            if(i<26){
                chs[i]=(char)(65+i);
            }
            else{
                chs[i]=(char)(97+i-26);
            }
        }
        Random r=new Random();
        for(int i=0;i<4;i++){
            int index=r.nextInt(52);
            sb.append(chs[index]);
        }
        String s=sb.append(r.nextInt(10)).toString();

        char[] arr=s.toCharArray();
        int k=r.nextInt(5);
        char tmp=arr[k];
        arr[k]=arr[arr.length-1];
        arr[arr.length-1]=tmp;
        arr.toString();
        System.out.println(arr);
    }
}
