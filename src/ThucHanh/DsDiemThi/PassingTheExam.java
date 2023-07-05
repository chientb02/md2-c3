package ThucHanh.DsDiemThi;
import java.util.Scanner;
public class PassingTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("nhập số lượng hs");
        int width = scanner.nextInt();
        int [] arr = new int[width];
        int count = 0 ;
        int dem ;
        for (int i = 0; i < arr.length; i++) {
            dem = 1 ;
            dem += i ;
            System.out.println("điểm học sinh thứ" +dem+ "   là");
            arr[i] = scanner.nextInt();
            if (arr[i]>=5 && arr[i] <= 10){
                count++;
            }
        }
        System.out.println("số lượng học sinh đỗ là:" + count);
    }
}
