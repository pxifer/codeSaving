package API_paqu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo3 {
    public static void main(String[] args) {
        String s="jAvaowhrefjksdjkfjs,adhfJava8,fa;kdjava17mJAVA11,jfajava17";

        //只获取前半部分
        String regex="((?i)java)(?=8|11|17)";
        //全部获取
        String regex2="((?i)java)(8|11|17)";
        String regex3="((?i)java)(?:8|11|17)";
        //获取除了这些版本的java
        String regex4="((?i)java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex4);
        Matcher matcher = p.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
