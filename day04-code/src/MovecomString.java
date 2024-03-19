public class MovecomString {
    public static void main(String[] args) {
        String A="abcde";
        String B="deabc";
//        System.out.println(MoveString(A,B));
        System.out.println(checkRet(A,B));
    }
    public static boolean MoveString(String A,String B){
        if(A.length()!=B.length()){
            return false;
        }
        String str="";
        for (int i = 0; i < A.length(); i++) {
            str=A.substring(i)+A.substring(0,i);
            boolean flag=str.equals(B);
            if(flag){
                return true;
            }
        }
        return false;
    }
    //方法二:结果数次变化
    public static boolean checkRet(String A,String B){
        if(A.length()!=B.length()){
            return false;
        }
        for (int i = 0; i < A.length(); i++) {
            String str=rotary(A);
            if(str.equals(B)){
                return true;
            }
        }
        return false;
    }
    public static String rotary(String A){
        return A.substring(1)+A.charAt(0);
        //方法3:数组一次改变
    }
}
