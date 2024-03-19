import java.util.Random;

public class destoryArr {
    public static void main(String[] args) {

        String str="abcdef";
        char[] array = str.toCharArray();
        SwitchArr(array);
        String result=new String(array);
        System.out.println(result);
    }
    public static void SwitchArr(char[] arr){
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int k=r.nextInt(arr.length);
            char tmp=arr[i];
            arr[i]=arr[k];
            arr[k]=tmp;
        }
    }
}
