public class OuterDemo {
    public static void main(String[] args){
        Outer o=new Outer(new Inter() {
            @Override
            public void show() {
System.out.println("123");
            }
        });
        Inter a=new Inter() {
            @Override
            public void show() {
                System.out.println("playGame");
            }
        };
        o.method(a);
    }
}
