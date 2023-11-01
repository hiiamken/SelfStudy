public class bai6_epkieudulieu {
    /*
    - Có 2 dạng ép kiểu dữ liệu:
        + Ép kiểu rộng: từ bé -> lớn
            VD: int -> long -> float -> double
        + Ép kiểu hẹp: từ lớn -> ebs
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a/b; //int >> double
        System.out.println(kq);

        //ép kiểu hẹp
        int c = 128;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);

        int e = 15;
        byte f = (byte) e;// ép kiểu int >> byte
        System.out.println(e);
        System.out.println(f);
    }
}
