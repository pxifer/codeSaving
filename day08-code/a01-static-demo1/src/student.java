import java.sql.SQLOutput;

public class student {
    String name;
    int age;
    String gender;
    public static String teacherName;

    public student() {
    }

    public student(String name, int age, String gender, String teacherName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.teacherName = teacherName;
    }

    /**
     * 获取
     * @return teacherName
     */
    public static String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置
     * @param teacherName
     */
    public static void setTeacherName(String teacherName) {
        student.teacherName = teacherName;
    }

    public void sleep() {
        System.out.println(name + "在睡觉");
    }

    public void eat() {
        System.out.println(name + "在吃饭");
    }
    public void print(){
        System.out.println(name+","+age+","+gender+","+teacherName);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + ", gender = " + gender + ", teacherName = " + teacherName + "}";
    }
}
