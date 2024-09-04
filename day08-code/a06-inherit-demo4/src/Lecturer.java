public class Lecturer extends employee{
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("讲师在讲课");
    }
}
