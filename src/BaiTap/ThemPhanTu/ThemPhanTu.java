package BaiTap.ThemPhanTu;
import java.util.Scanner;
public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("nhap số cần chèn");
        int number = inputNumber.nextInt();
        Scanner inputIndex = new Scanner(System.in);
        System.out.println("nhap vị trí cần chèn");
        int index = inputIndex.nextInt();
        int[] list = {1,2,3,4,5,6,7,8,9};
        int[] myList = new int[list.length + 1] ;
        myList[index] = number;
        for (int i = 0; i < index; i++) {
            myList[i]=list[i];
        }
        for (int i = index+1; i < myList.length ; i++) {
            myList[i]=list[i-1];
        }
        for (int item: myList) {
            System.out.println(item);
        }
    }

}
