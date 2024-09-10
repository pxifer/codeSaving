public class PingPongCoach extends coach implements English{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void teach() {
        System.out.println("教学乒乓球");
    }
}
