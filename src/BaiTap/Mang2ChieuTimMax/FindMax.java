package BaiTap.Mang2ChieuTimMax;
import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int width;
        int height;
        int [][] arr ;
        int number ;
        do{
            System.out.println("nhập số lượng biến trong 1 hàng  :");
            width = scanner.nextInt();
            System.out.println("nhập số lượng hàng :");
            height = scanner.nextInt();
            if(width > 20 || height > 20 ){
                System.out.println("số lượng không được vượt quá 20");
            }
        } while(width > 20 || height > 20 ) ;
        arr = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Nhập giá trị ở vị trí thứ "+ i + j );
                arr[i][j] = scanner.nextInt();
            }
        }
        while (width > 0) {
        System.out.println("nhập số cần kiểm tra");
        number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(number == arr[i][j]){
                    count++ ;
                    System.out.println("số đã nhập là :"+ number +"ở vị trí" + i+ " " + j);
                    break;
                }
            }
        }
        if (count == 0 ) {
            System.out.println("số nhập vào không có trong mảng");
        }
    }}
}
