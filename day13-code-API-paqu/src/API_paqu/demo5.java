package API_paqu;

public class demo5 {
    public static void main(String[] args) {
        String s= "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String regex1="[\\w[^_]]+";
        String ret = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(ret);

        String[] split = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
