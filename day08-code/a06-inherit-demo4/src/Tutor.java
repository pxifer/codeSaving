public class Tutor extends employee{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("助教在备课");
    }
}
