public class GirlFriend {
    //属性变量

    //局部变量与成员变量(this区分两种变量)
    //this.name->成员变量
    //name->局部变量(就近原则)
    private String name;
    private int age;
    private String gender;
    //方法构造:若没写构造方法,虚拟机会自动生成空参构造方法
    //1.空参构造
    public GirlFriend(){
        System.out.println("我的空参girlfriend");
    }
    //2.有参构造
    public GirlFriend(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    //set:对变量进行赋值
    //get对外提供变量的值

    //set赋值函数
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age>=18&&age<=25){
            this.age = age;
        }
        else{
            System.out.println("年龄错误");
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //get向外提供函数值
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    //行为
    public void eat() {
        System.out.println("女朋友在吃饭");
    }

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }
}
