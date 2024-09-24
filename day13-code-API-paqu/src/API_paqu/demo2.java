package API_paqu;

import java.awt.image.RasterFormatException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.cnblogs.com/tynam/p/8807366.html");
        URLConnection conn = url.openConnection();
        BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String regex="[1-9]\\d{17}";
        Pattern p = Pattern.compile(regex);
        while((line=br.readLine())!=null){
            Matcher m = p.matcher(line);
            while(m.find()){
                System.out.println(m.group());
            }
        }
        br.close();
    }
}
