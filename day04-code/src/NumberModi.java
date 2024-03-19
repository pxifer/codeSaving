public class NumberModi {
    public static void main(String[] args) {
        String num1="11";
        String num2="22";
        String ret=NumberMouple(num1,num2);
        System.out.println(ret);
    }
    public static String NumberMouple(String num1,String num2){
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < num1.length(); i++) {
            sum1=sum1*10+(num1.charAt(i)-'0');
        }
        for (int i = 0; i < num2.length(); i++) {
            sum2=sum2*10+(num2.charAt(i)-'0');
        }
        int sum=sum1*sum2;
        String result=sum+"";
        return result;
    }
}
