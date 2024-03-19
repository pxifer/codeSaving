public class GameTest {
    public static void main(String[] args) {
        Role r1=new Role("孙悟空",100,"男");
        Role r2=new Role("牛魔",100,"男");
        r1.show(r1);
        r2.show(r2);
        while(true){
            r1.KongFu(r2);
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"KO了"+r2.getName());
                break;
            }
            r2.KongFu(r1);
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"KO了"+r1.getName());
                break;
            }
        }


    }
}
