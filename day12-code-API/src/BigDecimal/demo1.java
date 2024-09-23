package BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class demo1 {
    public static void main(String[] args) {
        //double传输的BigDecimal有误
        BigDecimal bd1=new BigDecimal(0.01);
        BigDecimal bd3=new BigDecimal(0.09);
        //字符串构造和静态方法调用准确
        BigDecimal bd4=BigDecimal.valueOf(0.09);
        BigDecimal db6=BigDecimal.valueOf(0.01);
        BigDecimal bd2=new BigDecimal("0.01");
        BigDecimal bd5=new BigDecimal("0.09");

        System.out.println(bd1.add(bd3));
        System.out.println(bd1.add(bd4));

        System.out.println(bd4.add(db6));

        System.out.println(bd2.add(bd5));
        System.out.println(bd5.add(db6));

        System.out.println(bd1.add(bd5));

    }
}
