import java.util.Scanner;

public class bai18_kiemtrasoNguyenTo {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số cần kiểm tra: ");
            int x = sc.nextInt();

            while (x<=0) {
                System.out.println("Mời nhập lại số sao cho nó lớn hơn 0");
                x = sc.nextInt();
            }
            System.out.println("Số " +x + " đạt điều kiện để tiếp tục");
            int demUoc = 0;
            for (int i=1;i<=x;i++){
                if (x%i == 0){
                    demUoc++;
                }
            }
            if (demUoc == 2){
                System.out.println(x+ " là số nguyên tố");
            } else {
                System.out.println(x+ " không phải là số nguyên tố");
            }
            System.out.println("\nBạn có muốn thoát không? Bấm Y để thoát");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equals("y") || traloi.equals("Y")) {
                System.out.println("\nKết thúc chương trình. Tạm biệt bạn!");
                break;
            }
        }
    }
}
