import java.util.Random;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
//        int arr1[]={1,2,3,45};
//        int []arr2=new int[]{1,2,3,45};
//        String arr3[]={"zhangsan","lisi","wangwu"};
//        String []arr4=new String[]{"zhangsan","lisi","wangwu"};

        //通过创建随机数,求其和与平均值
//        int []arr=new int[10];
//        Random r=new Random();
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=r.nextInt(100)+1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//        }
//        double anverage=sum*1.0/arr.length;
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<anverage){
//                count++;
//            }
//        }
//        System.out.println(sum);
//        System.out.println(anverage);
//        System.out.println(count);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//数组首尾交换
//int []arr={1,2,3,4,5};
//for(int i=0,j=arr.length-1;i<j;i++,j--){
//    int tmp=arr[i];
//    arr[i]=arr[j];
//    arr[j]=tmp;
//}
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//打乱数组中的数据
//        int arr[] = {1, 2, 3, 4, 5};
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            int num = r.nextInt(arr.length - 1);
//            //注意:打乱用交换保证不重复,不是赋值
//            int tmp = arr[i];
//            arr[i] = arr[num];
//            arr[num] = tmp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//day05-6
//        Scanner sc = new Scanner(System.in);
//        int arr1[] = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
//        int[] arr2 = new int[arr1.length + 1];
//        int k = 0;
//        System.out.println("请输入一个整数");
//        int num = sc.nextInt();
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//        //
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr2[i] > num) {
//                k = i;
//                break;
//            }
//        }
//
//        int right = arr2.length - 1;
//        while (k < right) {
//            arr2[right] = arr2[right - 1];
//            right--;
//        }
//        arr2[k] = num;
//        for (int i1 = 0; i1 < arr2.length; i1++) {
//            System.out.print(arr2[i1] + " ");
//        }

//奇数前偶数后
//int[] arr=new int[]{2,4,6,7,3,8,9,11,7};
//int[] brr=new int[arr.length];
//int left=0;
//int right=arr.length-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%2!=0){
//                brr[left]=arr[i];
//                left++;
//            }
//            else{
//                brr[right]=arr[i];
//                right--;
//            }
//        }
//        for (int i = 0; i < brr.length; i++) {
//            System.out.print(brr[i]+" ");
//        }

//
    }
}
