public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"的狗两只前腿死死抱着"+something+"猛吃");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
