//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
    String s=transport();
        System.out.println(s);
    }
    public static String transport(){
        StringBuilder sb=new StringBuilder();
        char[] s1={'a','b','c'};
        String s2="abc";
        String s3=new String(s1);
        String s4=sb.append(s1).toString();
        String s5=s1.toString();
        return s5;
    }
}
