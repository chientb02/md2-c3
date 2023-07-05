package BaiTap.GopMang;

import java.util.Scanner;

public class ConCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng 1");
        int index1 = scanner.nextInt();
        System.out.println("nhập độ dài mảng 2");
        int index2 = scanner.nextInt();
        int[] arr1 ;
        int[] arr2 ;
        int[] arrConCat ;
        do {
            if(index1 >20 || index2 >20 ){
                System.out.println("độ dài mảng phải nhỏ hơn 20");
            }
        } while (index1 >20 || index2 >20);
        arr1 = new int[index1];
        arr2 = new int[index2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhập phần tử thứ " +  i +" của mảng 1" );
            arr1[i] = scanner.nextInt() ;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("nhập phần tử thứ " +  i +" của mảng 2" );
            arr2[i] = scanner.nextInt() ;
        }
        arrConCat = new int[index1+ index2];
        for (int i = 0; i < arr1.length; i++) {
            arrConCat[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrConCat[arr1.length + i] = arr2[i];
        }
        System.out.println("mảng 1 là: ");
        for (int test:
             arr1) {
            System.out.println(test);
        }  System.out.println("mảng 2 là: ");
        for (int test:
             arr2) {
            System.out.println(test);
        }  System.out.println("mảng nối là: ");
        for (int test:
             arrConCat) {
            System.out.println(test);
        }
    }
}
