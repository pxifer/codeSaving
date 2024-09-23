package SystemTemple;

public class demo1 {
    public static void main(String[] args) {
        //1.currentTimeMillis:查询当前毫秒-作用:判断代码的运行时间
     long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            boolean flag=isPrime2(i);
            if(flag){
                System.out.println(i);
            }
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);


        //2.exit:退出虚拟机->System.exit(0)//正常终止

        //3.arraycopy:数组拷贝
//        int[] srcArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] desArray = new int[srcArray.length];
//        System.arraycopy(srcArray, 0, desArray, 2, srcArray.length - 2);
//        for (int i = 0; i < desArray.length; i++) {
//            System.out.print(desArray[i] + " ");
//        }


//引用数据的拷贝->子类可以赋值给父类
//        student stu1=new student("zhangsan",12);
//        student stu2=new student("lisi",15);
//        student stu3=new student("wangwu",18);
//
//        student[] arr1={stu1,stu2,stu3};
//        person[] arr2=new person[arr1.length];
//        System.arraycopy(arr1,0,arr2,0,arr1.length);
//        for (int i = 0; i < arr2.length; i++) {
//            student stu=(student) arr2[i];
//            System.out.println(stu.getName()+","+stu.getAge());
//        }
    }

    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}

class person {
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "person{name = " + name + ", age = " + age + "}";
    }
}

class student extends person {
    public student() {
    }

    public student(String name, int age) {
        super(name, age);
    }
}