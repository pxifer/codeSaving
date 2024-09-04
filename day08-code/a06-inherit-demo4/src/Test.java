public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher("001","lisi");
        System.out.println(t.getId()+","+t.getName());
        t.work();
        Buyer b=new Buyer();
        b.setId("002");
        b.setName("zhangsan");
        System.out.println(b.getId()+","+b.getName());
        b.work();
    }
}
