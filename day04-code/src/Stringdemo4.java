public class Stringdemo4 {
    public static void main(String[] args) {
        //身份证信息转化
        String information="511133202006060037";
        String year=information.substring(6,10);
        String month=information.substring(10,12);
        String day=information.substring(12,14);
        char c=information.charAt(16);
        char gender;
        if((c-'0')%2==0){
            gender='女';
        }
        else{
            gender='男';
        }
        System.out.println("身份证性别为:"+gender);
        System.out.println("生日为"+year+"年"+month+"月"+day+"日");
    }
}
