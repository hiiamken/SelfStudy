import java.util.Scanner;

public class baitap13_chanle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số: ");
        int x = sc.nextInt();
        int kq = 0;
        if (x % 2 != 0){
            System.out.println("Tôi không tính tổng số lẻ, bye bye");
        } else {
            for ( int i=0;i<=x;i+=2){
                kq += i;
            }
            System.out.println("Tổng các số chẵn từ 0 đến số " +x + " là: " +kq);
        }
    }
}
