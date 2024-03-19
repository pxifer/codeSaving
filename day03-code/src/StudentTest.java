import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];
        int input;
        do {
            menu();
            System.out.println("请输入选择:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    break;
                case 2:
                    int id = sc.nextInt();
                    Delete(arr, id);
                case 3:
                    Show(arr);
                default:
                    break;

            }
        } while (input != 0);

    }

    public static void menu() {
        System.out.println("###################");
        System.out.println("###0.exit  1.Add###");
        System.out.println("#2.Delete   3.Show#");
    }

    //寻找id
    public static boolean Search(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (id == stu.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    //    public static int getCount(Student[] arr) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != null) {
//                count++;
//            }
//        }
//        return count;
//    }
//创建新数组
    public static Student[] Creat(Student[] arr, Student stu) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = stu;
        return newArr;
    }

    //打印数组
    public static void Show(Student[] newArr) {
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != null)
                System.out.println(newArr[i].getId() + "," + newArr[i].getName() + "," + newArr[i].getAge());
        }
    }

    //删除对象
    public static void Delete(Student[] arr, int id) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                for (int j = i; j < arr.length; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
    }
}

