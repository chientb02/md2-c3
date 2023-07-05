package BaiTap.XoaPhanTu;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int size;
        int[] array;
        boolean flag = true ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập độ dài mảng");
            size = scanner.nextInt();
            array = new int[size];
            if (size > 20) {
                System.out.println("độ dài mảng nhỏ hơn 20");
            }
        } while (size > 20);

        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập số thứ :" + i);
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.println("nhập số cần xóa");
        int inputNumber = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(inputNumber == array[i]){
                flag = false;
                for (int j = i; j < array.length -1 ; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1]=0 ;
                for (int test: array) {
                    System.out.println(test);
                }
            }
        } if ( flag) {
            System.out.println("số đã nhập không có trong mảng");
        }
    }
}
