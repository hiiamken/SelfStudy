import java.util.Scanner;

public class baitap04_tim2sokhivietTongvaHieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tổng 2 số: ");
        double tong = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập vào hiệu 2 số: ");
        double hieu = sc1.nextDouble();
        double x = (tong+hieu)/2;
        double y = (tong-hieu)/2;
        System.out.println("Giá trị x cần tìm là: " +x);
        System.out.println("Giá trị y cần tìm là: " +y);
    }
}
