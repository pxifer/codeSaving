package BigInteger;

import java.math.BigInteger;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        //1.创建随机数,需要随机种子,产生0到2的k次方-1的随机数
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            BigInteger bd1=new BigInteger(4,r);
            System.out.print(bd1+" ");
        }
        //获取一个指定的大整数,可以超出long的范围
        //1.参数是字符串,并且只能为整数
        System.out.println();
        BigInteger bd2=new BigInteger("9999999999999999");
        System.out.println(bd2);
        //获取对应进制的大整数
        BigInteger bd3=new BigInteger("fffffffffffffff",16);
        System.out.println(bd3);

        //静态方法创建对象
        //1.只能在long的取值范围内
        //2.对-16~16的数字存在优化,不会再次创建对象
        //对象一旦创建,内部数据就不能改变,数据接收需要创建新的对象
        BigInteger bd4=BigInteger.valueOf(16);
        BigInteger bd5=BigInteger.valueOf(16);
        BigInteger bd6=BigInteger.valueOf(17);
        BigInteger bd7=BigInteger.valueOf(17);
        System.out.println(bd4==bd5);
        System.out.println(bd7==bd6);


    }
}
