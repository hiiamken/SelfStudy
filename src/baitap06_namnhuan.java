import java.util.Scanner;

public class baitap06_namnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm mà bạn muốn kiểm tra: ");
        int nam = sc.nextInt();
        if ((nam%4==0 && nam%100 !=0) || (nam%400==0)) {
            System.out.println("Năm nhuận");
        } else {
            System.out.println("Năm không nhuận");
        }
    }
}
