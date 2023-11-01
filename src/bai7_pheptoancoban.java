public class bai7_pheptoancoban {
    /*
    - Cộng: +
    - Trừ: -
    - Nhân: *
    - Chia: /
    - Chia có dư: %
    */
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        //phép cộng
        System.out.println("a + b = " +(a+b));
        //gán biến
        int kq = a+b;
        System.out.println("a + b = " +kq);

        System.out.println("a - b = " +(a-b));
        System.out.println("a x b = " +(a*b));
        System.out.println("a : b = " +((double)a/b));


        //Bài tập vận dụng
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;
        //gán kết quả
        int caua = i1+(i2*i3);
        int caub = i1*(i2+i3);
        int cauc = i1/(i2+i3);
        int caue = i1/i2+i3;
        int caug = 3+4+5/3;
        int caui = (3+4+5)/3;

        System.out.println(caua);
        System.out.println(caub);
        System.out.println(cauc);
        System.out.println(caue);
        System.out.println(caug);
        System.out.println(caui);
    }
}
