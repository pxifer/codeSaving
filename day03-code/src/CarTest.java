import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        int sum=0;
        double avg=0.0;
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c = new Car();
            //录入信息
            System.out.println("请输入汽车品牌:");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车价格:");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车颜色:");
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;
            sum+=price;
        }
        avg=sum*1.0/arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand());
            System.out.println(arr[i].getPrice());
            System.out.println(arr[i].getColor());
            System.out.println();
        }
        System.out.println("平均价格:"+avg);
    }
}
