//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        phone p = new newPhone();
        if (p instanceof newPhone) {
            newPhone np=(newPhone)p;
            np.call();
            np.message();
            np.playGame();
        } else if (p instanceof oldPhone) {
            oldPhone op=(oldPhone)p;
            op.call();
            op.message();
        } else {
            System.out.println("没有这个类型");
        }
    }
}