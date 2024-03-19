public class GirlFriendTest {
    public static void main(String[] args) {
        //空参构造,虚拟机自动生成
        GirlFriend girl1=new GirlFriend();
        //含参构造
        GirlFriend girl3=new GirlFriend("陶梦嫣",18,"元气少女");
        System.out.println(girl3.getName());
        System.out.println(girl3.getAge());
        System.out.println(girl3.getGender());
        System.out.println("===================");

        girl1.setName("李婉柔");
        girl1.setAge(18);
        girl1.setGender("萌妹子");

        System.out.println(girl1.getName());
        System.out.println(girl1.getAge());
        System.out.println(girl1.getGender());

        girl1.eat();
        girl1.sleep();

        System.out.println("=================");

        GirlFriend girl2=new GirlFriend();
        girl2.setName("火灵儿");
        girl2.setAge(19);
        girl2.setGender("萌妹子");

        System.out.println(girl2.getName());
        System.out.println(girl2.getAge());
        System.out.println(girl2.getGender());

        girl2.eat();
        girl2.sleep();

    }
}