public class AdminStaff extends employee{
    public AdminStaff(){}

    public AdminStaff(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("员工负责行政工作");
    }
}
