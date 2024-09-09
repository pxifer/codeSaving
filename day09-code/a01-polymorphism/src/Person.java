public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为"+age+"的"+name+"养了一只"+dog.getColor()+"的"+dog.getAge()+"的狗");
//        dog.eat(something);
//    }
//    public void keepPet(Cat cat,String something){
//        System.out.println("年龄为"+age+"的"+name+"养了一只"+cat.getColor()+"的"+cat.getAge()+"的狗");
//        cat.eat(something);
//    }

    public void keepPet(Animal a,String something){
        if(a instanceof Dog){
            Dog d=(Dog)a;
            System.out.println("年龄为"+age+"的"+name+"养了一只"+a.getColor()+"的"+a.getAge()+"的狗");
            a.eat(something);
        }else if(a instanceof Cat){
            Cat d=(Cat)a;
            System.out.println("年龄为"+age+"的"+name+"养了一只"+a.getColor()+"的"+a.getAge()+"的猫");
            a.eat(something);
        }else{
            System.out.println("没有这种动物");
        }
    }
}
