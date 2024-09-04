public class DogTest {
    public static void main(String[] args) {
        Hasky h=new Hasky();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();
        System.out.println("====================");
        Sharpei sp=new Sharpei();
        sp.eat();
        sp.drink();
        sp.lookHome();
        System.out.println("====================");
        ChineseDog cd=new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();
    }
}
