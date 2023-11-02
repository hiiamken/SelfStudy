import java.util.Scanner;

public class baitap11_khungtimkiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bấm số để chọn\n1. Tìm theo tên\n2. Tìm theo tác giả\n3. Tìm theo nhà xuất bản\n4. Tìm theo tiêu đề");
        int so = sc.nextInt();
        switch (so)
        {
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Phím bấm " +so + " không hợp lệ");
                break;
        }
    }
}
