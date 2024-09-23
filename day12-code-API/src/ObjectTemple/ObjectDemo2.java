package ObjectTemple;

public class ObjectDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data={1,2,3};
        user u1=new user("1","lisi","6",data);
        user u2=new user();
        u2= (user) u1.clone();
        System.out.println(u1);
        u2.setId("2");
        System.out.println(u2);
    }
}
