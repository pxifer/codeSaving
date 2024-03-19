public class substring {
    public static void main(String[] args) {
        String phoneNumber = "14998511482";
        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(phoneNumber.length() - 4);
        String ret=start+"***"+end;
        System.out.println(ret);
    }
}