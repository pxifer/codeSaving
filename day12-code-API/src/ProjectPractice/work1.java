package ProjectPractice;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        int recoder=1;
        for (int i = 1; i < 999999; i++) {
            int tmp = i;
            int count = 0;
            double ret = 0;
            while (tmp != 0) {
                tmp /= 10;
                count++;
            }
            tmp = i;
            for (int j = 0; j < count; j++) {
                ret += Math.pow(tmp % 10, count);
                tmp /= 10;
            }
            if (i == ret) {
                System.out.print(i+" ");
            }
            if(recoder<count){
                System.out.println();
                recoder=count;
            }
        }
    }
}
