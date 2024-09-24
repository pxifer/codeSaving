package API_paqu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo4 {
    public static void main(String[] args) {
        String  s="aaabbbbbbbbbbbbb";
        //贪婪爬取
        String regex1="ab+";
        //非贪婪爬取
        String regex2="ab+?";
        Pattern compile = Pattern.compile(regex2);
        Matcher matcher = compile.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());

        }

    }
}
