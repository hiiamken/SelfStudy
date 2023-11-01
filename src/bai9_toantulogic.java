public class bai9_toantulogic {
    public static void main(String[] args) {
        /*int i = 7;
        //kiểm tra giá trị >0 và i <10 không
        System.out.println(i>0 && i<10);
        //kiểm tra xem i > 10 hoặc < -1 không
        System.out.println(i>10 || i <-1);
        //phép phủ định
        System.out.println(!(i>10 || i<-1));

        *//*
        * Toán tử tiền tố, hậu tố
        * Tăng giá trị lên 1: a=1,a++ => a =2
        * *//*

        //Ví dụ
        int x = 100;
        int y = 90;
        int z = 80;
        int t = 70;

        x++; // tương đương x = x + 1
        ++y; // tăng y thêm 1 giá trị
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);*/

        /* Quy tắc viết dấu ++, --
        * a++, a-- (Viết phía sau biến) => Postfix
        * ++a, --a => Prefix
        *   Ưu tiên:
        *       Prefix -> Các phép toán còn lại -> Gán giá trị ở bên trái dấu bằng -> Postfix
        * */

        /*int q = 1;
        int w = 2;
        int e = q++ - ++w +1;
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);*/

        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
