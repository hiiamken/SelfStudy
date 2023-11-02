import java.text.DecimalFormat;
import java.util.Scanner;

public class baitap05_tinhtoanchisoBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chều cao (m): ");
        double chieucao = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng (kg): ");
        double cannang = sc1.nextDouble();
        double bmi = cannang/(chieucao*chieucao);
        DecimalFormat df = new DecimalFormat("#.##");
        String bmirutgon = df.format(bmi);
        System.out.println("BMI của bạn = " +bmirutgon);
        if (bmi <15) {
            System.out.println("Thân hình quá gầy");
        } else if (bmi>=15 && bmi<16) {
            System.out.println("Thân hình gầy");
        } else if (bmi>=16 && bmi<18.5) {
            System.out.println("Thân hình bình thường");
        } else if (bmi>=18.5 && bmi<25) {
            System.out.println("Thân hình hơi béo");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("Thân hình béo");
        } else {
            System.out.println("Thân hình quá béo");
        }

    }
}
