package BaiTap.TinhTongDuongCheoMaTran;
import java.util.Scanner ;
public class SumDiagonalsMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài ma trận");
        int height = scanner.nextInt();
        int [][] arr = new int[height][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.println("nhập giá trị tại vị trí thứ  " + i + "  "+ j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0 ;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
