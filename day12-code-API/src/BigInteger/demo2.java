package BigInteger;

import java.math.BigInteger;

public class demo2 {
    public static void main(String[] args) {
        BigInteger bd1=BigInteger.valueOf(15);
        BigInteger bd2=BigInteger.valueOf(2);
        BigInteger bd9=BigInteger.valueOf(15);

        BigInteger bd3=bd1.add(bd2);
        BigInteger bd4=bd1.divide(bd2);
        BigInteger[] bd5=bd1.divideAndRemainder(bd2);

        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5[0]);
        System.out.println(bd5[1]);

        boolean ret=bd1.equals(bd2);
        boolean res=bd1.equals(bd9);

        System.out.println(ret);
        System.out.println(res);

        BigInteger bd6=bd1.pow(2);
        System.out.println(bd6);

        BigInteger bd7=bd1.max(bd2);
        System.out.println(bd7);

        BigInteger bd8=new BigInteger("9999999999999");
        double v=bd8.doubleValue();
        System.out.println(v);
        int i=bd8.intValue();
        System.out.println(i);
    }
}
