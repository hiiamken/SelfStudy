import java.util.Scanner;

public class baitap12_vonglapForvaWhile {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên n: ");
        int n = sc.nextInt();
        int gt = 1;
        for (int i=1;i<=n;i++){
            gt = gt*i;
        }
        System.out.println(gt);*/

        //while
        int n;
        int i =1;
        int gt =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập va số nguyên n: ");
        n = sc.nextInt();
        while (i<=n){
            gt *= i;
            i++;
        }
        System.out.println(n+ "! = " +gt);
    }
}
