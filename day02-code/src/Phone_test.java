public class Phone_test {
    public static void main(String[] args) {
        Phone P=new Phone();
        //成员变量赋值
        P.brand="小米";
        P.price=1999.99;

        System.out.println(P.brand);
        System.out.println(P.price);
        //设计类方法调用
        P.call();
        P.playGame();
    }
}
