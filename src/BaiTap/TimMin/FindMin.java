package BaiTap.TimMin;
import java.util.Scanner;
public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lươngj phần tử trong mảng");
        int width = scanner.nextInt();
        int [] arr = new int[width] ;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập giá trị thứ" + i + " trong mảng");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0] ;
        for (int i = 1; i < arr.length; i++) {
             if(min > arr[i]) {
                 min = arr[i];
             }
        }
        System.out.println("giá trị nhỏ nhất là: " + min);
        }

}
