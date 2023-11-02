import java.util.Scanner;

public class baitap10_kiemtradiemTBdungtoantu3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình: ");
        double diemtb = sc.nextDouble();
        String ketqua = (diemtb >=8)?"Giỏi":(diemtb <8 && diemtb >=6.5)?"Khá":(diemtb<6.5&& diemtb>=5)?"Trung Bình":"Yếu";
        System.out.println("Học sinh thuộc loại " +ketqua);
    }
}
