public class Test {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("老王");
        p1.setAge(30);
        Person p2=new Person();
        p2.setName("老李");
        p2.setAge(35);
        Dog d=new Dog(2,"黑颜色");
        Cat c=new Cat(3,"灰颜色");
        p1.keepPet(d,"骨头");
        p2.keepPet(c,"千层饼");
    }
}
