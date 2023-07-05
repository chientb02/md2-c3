package BaiTap.DemSoLanXuatHienTrongChuoi;
import java.util.Scanner;
public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("nhập giá trị tìm");
        char str1 = scanner.next().charAt(0);
        int count = 0 ;
        char st ;
        for (int i = 0; i < str.length(); i++) {
            st = str.charAt(i);
            if (str1 == st){
                count++;
            }
        }
        System.out.println("số lần xuất hiện là:  " + count);
    }
}
