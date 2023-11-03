import java.util.Scanner;

public class bai21_vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập vào số b: ");
        double b = sc.nextDouble();
        System.out.println("Mời nhập vào dấu: ");
        String phepTinh = new Scanner(System.in).nextLine();
        switch (phepTinh){
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
            default:
                System.out.println("Khong hop le");
                break;
        }
    }
    public static void cong(double a, double b){
        double kq = a + b;
        System.out.println("kq = " +kq);

    }public static void tru(double a, double b){
        double kq = a - b;
        System.out.println("kq = " +kq);

    }public static void nhan(double a, double b){
        double kq = a * b;
        System.out.println("kq = " +kq);

    }public static void chia(double a, double b){
        if (b==0)
            System.out.printf("Khong hop le");
        else {
            double kq = a / b;
            System.out.println("kq = " +kq);

        }
    }
}
