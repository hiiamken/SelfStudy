import java.util.Scanner;

public class baitap07_thang30hay31ngay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng (Bằng số) mà bạn muốn kiểm tra: ");
        int thang = sc.nextInt();
        if (thang < 1 || thang > 12) {
            System.out.println("Tháng không hợp lệ");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Tháng " +thang + " có 30 ngày");
        } else if (thang == 2){
            System.out.println("Nhập thêm năm để tiếp tục: ");
            int nam = sc.nextInt();
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                System.out.println("Tháng 2 năm " +nam + " có 29 ngày");
            } else {
                System.out.println("Tháng 2 năm " +nam + " có 28 ngày");
            }
        } else {
            System.out.println("Tháng " +thang + " có 31 ngày");
        }
    }
}
