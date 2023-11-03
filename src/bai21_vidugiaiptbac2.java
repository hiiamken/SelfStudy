import java.util.Scanner;

public class bai21_vidugiaiptbac2 {
    public static void main(String[] args) {
        String kq = GiaiPTBac2(1,2,3);
        String kq2 = GiaiPTBac2(1,2,1);
        String kq3 = GiaiPTBac2(1,2,-3);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);

        //Nhập
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập và số a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập và số b: ");
        double b = sc.nextDouble();
        System.out.println("Mời nhập và số c: ");
        double c = sc.nextDouble();
        String kq4 = GiaiPTBac2(a,b,c);
        System.out.println(kq4);

    }
    public static String GiaiPTBac2(double a, double b, double c){
        if (a == 0){
            if (b== 0 && c==0)
                return "Phương trình vô số nghiệm";
            else if (b == 0 && c != 0) {
                return "Phương trình vô nghiệm";
            } else  {
                return "Phương trình có: " + (-c/b);
            }
        }
        else {
            double delta = (b*b)-4*a*c;
            if (delta<0)
                return "Phương trình bậc hai vô nghiệm";
            else if (delta == 0) {
                double x = -b/(2*a);
                return "Phương trình bậc hai có nghiệm kép là: " +x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                return "Phương trình bậc hai có hai nghiệm x1 = "+x1+" và x2 = "+x2;
            }
        }
    }
}
