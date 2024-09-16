import java.sql.SQLOutput;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Test {
    public static void main(String[] args) {
        new swim(){
            @Override
            public void swim() {
                System.out.println("匿名类的接口实现");
            }
        };
        new eat(){

            @Override
            public void eat() {
                System.out.println("匿名类的对象创建");
            }
        };
    }
}