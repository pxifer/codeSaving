package BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class demo2 {
    public static void main(String[] args) {
        BigDecimal bd1=BigDecimal.valueOf(10.0);
        BigDecimal bd2=BigDecimal.valueOf(3.0);

        BigDecimal bd3=bd1.add(bd2);
        BigDecimal bd5=bd1.subtract(bd2);
        BigDecimal bd6=bd1.multiply(bd2);
        BigDecimal bd7=bd1.divide(bd2,2, RoundingMode.HALF_UP);

        System.out.println(bd3);
        System.out.println(bd5);
        System.out.println(bd6);
        System.out.println(bd7);

    }
}
