import java.util.Scanner;

public class baitap14_tinhtongcacsole {
    public static void main(String[] args) {
        int x;
        int kq = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        x = sc.nextInt();
        if (x%2 != 0){
            while (i<=x){
                if ( i == 3){
                    i +=2;
                    continue;
                } else {
                    kq += i;
                    i+=2;
                }
            }
            System.out.println("Tổng các số lẻ từ 1 đến " +x + " là: " +kq);
        }
    }

}
