import java.util.Random;

public class bai25_random {
    public static void main(String[] args) {
        //khởi tạo đối tượng
        Random rd = new Random();
        //1. Lấy ngẫu nhiên 1 số nguyên
        int soNguyen = rd.nextInt(51); //cHẠY TỪ -50 ĐẾN 50
        System.out.println(soNguyen);

        //2. Chạy ngẫu nhiên số thực
        double x = rd.nextDouble(-100, 100);
        System.out.println(x);
    }
}
