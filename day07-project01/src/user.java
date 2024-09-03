public class user {
    private String uername;
    private String password;
    private String idcard;
    private String phonenumber;

    public user() {
    }

    public user(String uername, String password, String idcard, String phonenumber) {
        this.uername = uername;
        this.password = password;
        this.idcard = idcard;
        this.phonenumber = phonenumber;
    }

    /**
     * 获取
     *
     * @return uername
     */
    public String getUername() {
        return uername;
    }

    /**
     * 设置
     *
     * @param uername
     */
    public void setUername(String uername) {
        this.uername = uername;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return idcard
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置
     *
     * @param idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取
     *
     * @return phonenumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置
     *
     * @param phonenumber
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}
