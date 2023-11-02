import java.util.Scanner;

public class bai13_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một số nguyên: ");
        int a = sc.nextInt();
        //Kiểm tra số dư
        int ketqua = a%2;
        switch (ketqua)
        {
            case 0:
                System.out.println(a+ " là số chẵn");
                break;
            default:
                System.out.println(a+ " là số lẻ");
                break;
        }
    }
}
