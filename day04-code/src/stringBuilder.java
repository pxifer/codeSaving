public class stringBuilder {
    public static void main(String[] args) {
        //拼接字符串
        int[] arr={1,2,3};
        //调用方法返回字符串
        String str = arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(int[] arr){
        java.lang.StringBuilder sb=new java.lang.StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
