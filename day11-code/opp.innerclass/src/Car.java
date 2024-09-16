public class Car {
    private String carBrand;
    private String carAge;
    private String carColor;
public void show(){
    Engine e=new Engine();
    System.out.println(e.engienName);
}
     class Engine{
        private String engienName;
        private String engineAge;
         public void show(){
             System.out.println(engineAge);
             System.out.println(carAge);
         }
    }

}
