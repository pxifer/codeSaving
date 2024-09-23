package ObjectTemple;
import java.util.StringJoiner;

public class user implements Cloneable{
    private String id;
    private String username;
    private String password;
    private int[] date;

    public user() {
    }

    public user(String id, String username, String password, int[] date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.date = date;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return date
     */
    public int[] getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(int[] date) {
        this.date = date;
    }

    public String toString() {
        return "user{id = " + id + ", username = " + username + ", password = " + password + ", date = " + arrToString() + "}";
    }

    public String arrToString(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i:date) {
            sj.add(i+"");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] newDate=new int[this.date.length];
        System.arraycopy(this.date,0,newDate,0,newDate.length);
       user u=(user)super.clone();
       u.date=newDate;
        return u;
    }
}
