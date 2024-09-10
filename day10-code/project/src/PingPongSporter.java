public class PingPongSporter extends player implements English{
    public PingPongSporter() {
    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
