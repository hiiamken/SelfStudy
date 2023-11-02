import java.util.Scanner;

public class baitap09_kiemtrathangthuocQuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thang;
        String choice;

        do {
            do {
                System.out.println("Nhập vào tháng (bằng số) mà bạn muốn kiểm tra: ");
                thang = scanner.nextInt();
                if (thang < 1 || thang > 12) {
                    System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
                }
            } while (thang < 1 || thang > 12);

            if (thang == 1 || thang == 2 || thang == 3) {
                System.out.println("Tháng " + thang + " thuộc quý 1");
            } else if (thang == 4 || thang == 5 || thang == 6) {
                System.out.println("Tháng " + thang + " thuộc quý 2");
            } else if (thang == 7 || thang == 8 || thang == 9) {
                System.out.println("Tháng " + thang + " thuộc quý 3");
            } else {
                System.out.println("Tháng " + thang + " thuộc quý 4");
            }

            System.out.println("Bạn có muốn kiểm tra một tháng khác? (Nhập 'yes' nếu có, 'exit' để thoát)");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
