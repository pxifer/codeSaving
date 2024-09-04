public class manager extends employee{
    private double manageReward;

    public manager() {
    }

    public manager(String id, String name, int salary, double manageReward) {
        super(id, name, salary);
        this.manageReward = manageReward;
    }

    public double getManageReward() {
        return manageReward;
    }

    public void setManageReward(double manageReward) {
        this.manageReward = manageReward;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("(管理他人)");
    }
}
