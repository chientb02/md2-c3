package BaiTap.TinhTongTrong1Cot;

import java.util.Scanner;

public class SumHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cột ");
        int height = scanner.nextInt();
        System.out.println("nhập phần tử trong 1 hàng ");
        int width = scanner.nextInt();
        int[][] arr = new int[height][width];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("nhập phần tử thứ :" + i + "   " + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhập cột muốn tính tổng");
        int index = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < height; i++) {
            sum += arr[i][index];
        }
        System.out.println(sum);
    }
}
