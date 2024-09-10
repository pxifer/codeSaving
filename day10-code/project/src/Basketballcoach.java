public class Basketballcoach extends coach{
    public Basketballcoach() {
    }

    public Basketballcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教学打篮球");
    }
}
