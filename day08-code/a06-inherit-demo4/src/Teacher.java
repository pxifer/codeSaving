public class Teacher extends employee{
    public Teacher(){}
    public Teacher(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("员工在教育学生");
    }
}
