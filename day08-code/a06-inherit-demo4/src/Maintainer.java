public class Maintainer extends employee{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("维护人员在进行设备维护");
    }
}
