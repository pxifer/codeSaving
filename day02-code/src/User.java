public class User {
    //成员变量名
    String username;
    String password;
    String email;
    String gender;
    int age;

    public User() {
    }

    //快捷键:
    //Alt+insert
    //Alt+Fn+insert
    //快捷生成:插件PTG生成javabean

    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
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

//手打练习
    //空参和满参方法构造
//    public User(){}
//    public User(String username,String password,
//                String email,String gender, int age){
//        this.username=username;
//        this.password=password;
//        this.email=email;
//        this.gender=gender;
//        this.age=age;
//    }
//    //set和get函数构造
//    public void setName(String username){
//        this.username=username;
//    }
//    public void setPassword(String password){
//        this.password=password;
//    }
//    public void setEmail(String email){
//        this.email=email;
//    }
//    public void setGender(String gender){
//        this.gender=gender;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
//
//    //get
//    public String getName(){
//        return username;
//    }
//     public String getPassword(){
//        return password;
//    }
//     public String getEmail(){
//        return email;
//    }
//     public String getGender(){
//        return gender;
//    }
//     public int getAge(){
//        return age;
//    }

}
