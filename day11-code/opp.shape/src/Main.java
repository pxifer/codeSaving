
public class Main {
    public static void main(String[] args) {
        Round r=new Round(2.0,3.14);
        System.out.println(r.area(r.getR(),r.getT()));;
        System.out.println(r.circum(r.getR(),r.getT()));
        Rectangle rtg=new Rectangle(1.0,2.0);
        System.out.println(rtg.area(rtg.getHeight(),rtg.getWidth()));
        System.out.println(rtg.circum(rtg.getHeight(),rtg.getWidth()));
    }
}