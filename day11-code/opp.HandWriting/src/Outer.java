public class Outer{
    Inter b;
    public Outer(){}
    public Outer(Inter b){
        b=this.b;
    }
    public void method(Inter a){
        a.show();
    }
}
