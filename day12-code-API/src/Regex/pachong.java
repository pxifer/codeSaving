package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pachong {
    public static void main(String[] args) {
        String str="java1,afjadl;fjlasjava8,aajlfdkjfjava11,jadljfaljava17";
        method1(str);
    }

    private static void method1(String str) {
        Pattern p = Pattern.compile("java\\d{0,2}");
        Matcher m = p.matcher(str);
       while(m.find()){
           String s = m.group();
           System.out.println(s);
       }
    }
}
