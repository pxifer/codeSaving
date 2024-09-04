public class employeeTest {
    public static void main(String[] args) {
        chef c=new chef();
        c.setId("0022");
        c.setName("lisi");
        c.setSalary(8000);
        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getSalary());
        c.eat();
        c.work();
        System.out.println("=================");
        manager m=new manager("0011","zhangsan",12000,8000);
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getSalary());
        System.out.println(m.getManageReward());
        m.eat();
        m.work();

    }
}
