public class chef extends employee{
    public chef() {
    }

    public chef(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        super.work();
        System.out.println("(炒菜)");
    }
}
