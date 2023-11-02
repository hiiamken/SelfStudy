import java.util.Scanner;

public class baitap08_giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        System.out.println("a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("c = ");
        int c = new Scanner(System.in).nextInt();
        double delta = Math.pow(b,2)-4*a*c;
        if (delta<0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = (-b)/(2.0*a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " +x);
        } else {
            double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
            System.out.println("Phương trình có hai nghiệm là x1 = " +x1 + " và x2 = " +x2);
        }
    }
}
