package RuntimeTemple;

import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //Runtime:java的运行对象
        //1.exit:停止虚拟机    2.availableProcessors:获得cup线程
        //3.maxMemory:获取总内存大小   4.totalMemory:已获取内存大小
        //5.freeMemory:剩余内存条大小  6.exec:cmd命令


        Runtime r1=Runtime.getRuntime();
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(r1.maxMemory());
        System.out.println(r1.totalMemory());
        System.out.println(r1.freeMemory());
//        r1.exec("shutdown -s -t 3600");

        Runtime.getRuntime().exit(0);



    }
}
