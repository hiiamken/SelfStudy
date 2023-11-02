import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();
        //Kiểm tra điều kiện
        if (dtb <= 10 && dtb >= 8) {
            System.out.println("Bạn xếp loại Giỏi");
        } else if (dtb<8 && dtb>=6.5){
            System.out.println("Bạn xếp loại Khá");
        } else if (dtb<6.5 && dtb >=4) {
            System.out.println("Bạn xếp loại Trung bình");
        } else {
            System.out.println("Bạn đã tạch");
        }
    }
}

