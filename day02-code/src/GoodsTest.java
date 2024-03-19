public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001", "vivo", 3200.0, 324);
        Goods g2 = new Goods("002", "台灯", 55.0, 99);
        Goods g3 = new Goods("003", "耳机", 125.0, 189);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("id:" + arr[i].getId() + ",品牌:" + arr[i].getName() + ",价格为:" + arr[i].getPrice() + ",库存为:" + arr[i].getCount());
        }
    }
}