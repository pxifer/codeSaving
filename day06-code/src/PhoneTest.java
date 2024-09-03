import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phones = lowPhonePrice(list);
        for (int i = 0; i < phones.size(); i++) {
            System.out.println("品牌:"+phones.get(i).getBrand()+",价格:"+phones.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> lowPhonePrice(ArrayList<Phone> list) {
        ArrayList<Phone> ret = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
            ret.add(list.get(i));
            }
        }
        return ret;
    }
}
