public class Buyer extends employee{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("员工在采购");
    }
}
