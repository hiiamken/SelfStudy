import java.util.Scanner;

public class bai10_timhieuscanner {
    public static void main(String[] args) {
        //Khởi tạo 1 đối tượng
        /*Scanner sc = new Scanner(System.in);

        //Cho phép nhập chuỗi
        System.out.println("Mời nhập vào mật khẩu cấp 1: ");
        String mk1 = sc.nextLine();
        System.out.println("Mật khẩu cấp 1 của bạn là: " +mk1);

        //Nhập số nguyên
        System.out.println("Mời nhập vào 1 số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("Số nguyên a = " +a);

        //Nhập số float
        System.out.println("Mời nhập vào một số thực x:");
        float x = new Scanner(System.in).nextFloat();
        System.out.println("Số thức x = " +x);

        //Nhập 1 chuỗi
        System.out.println("Mời nhập vào mật khẩu cấp 2: ");
        String mk2 = new Scanner(System.in).nextLine();
        System.out.println("Mật khẩu cấp 2 của bạn là: " +mk2);*/


        //Bài tập: Tính chu vi và diện tiên của hình tròn
        Scanner sc = new Scanner(System.in);
        System.out.println("Bán kính r =");
        double r = sc.nextDouble();
        double cv = 2*Math.PI *Math.pow(r,2);
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Chu vi bằng " +cv);
        System.out.println("Diện tích bằng " +dt);
    }
}
