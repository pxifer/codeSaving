import java.util.Random;

public class Role {
    Random r = new Random();
    //创建属性变量
    private String name;
    private int blood;
    private String gender;
    private String face;

    public String getFace() {
        return face;
    }

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%S。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%S。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%S。"
    };


    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            " 结果%s的脸色一下变很惨白，连退了好几步",
            "结果「轰」的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    //构造空参与含参方法
    public Role() {
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Role(String name, int blood, String gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //创建get与set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
//Role r1=new Role();
//Role r2=new Role();
//r1.attack(r2); ->r1攻击r2

    //行为方法
    public void show(Role role) {
        System.out.println("姓名为:" + role.getName());
        System.out.println("血量为:" + role.getBlood());
        System.out.println("性别为:" + role.getGender());
        if (getGender() == "男") {
            int index = r.nextInt(boyfaces.length);
            role.setFace(boyfaces[index]);
        } else if (getGender() == "女") {
            int index = r.nextInt(girlfaces.length);
            role.setFace(girlfaces[index]);
        } else {
            role.setFace("面目狰狞");
        }
        System.out.println("长相为:" + role.getFace());
    }

    public void KongFu(Role role) {
        int index = r.nextInt(attacks_desc.length);
        System.out.printf(attacks_desc[index], this.getName(), role.getName());
    }

    public void attack(Role role) {
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood > 0 ? remainBlood : 0;
        //修改被攻击者的血量
        role.setBlood(remainBlood);
        System.out.println();
        if (role.getBlood() > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (role.getBlood() > 80) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (role.getBlood() > 60) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (role.getBlood() > 50) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (role.getBlood() > 30) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (role.getBlood() > 20) {
            System.out.printf(injureds_desc[5], role.getName());
        } else if (role.getBlood() > 10) {
            System.out.printf(injureds_desc[6], role.getName());
        } else {
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println(",产生了"+hurt+"伤害,"+role.getName() + "还剩" + remainBlood + "点血。");
    }

}

