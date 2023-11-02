import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        //Nhập vào bàn phím 1 số, kiểm tra chẵn hay lẻ
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số: ");
        int n = sc.nextInt();
        String traloi = (n%2 ==0)?"Chẵn" :"Lẻ";
        System.out.println("Số vừa nhập là số " +traloi);
    }
}
