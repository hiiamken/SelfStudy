public class bai8_toantugan {
    /*
    * Toán tử gán
    * - Gán bằng: =
    *   VD: x = 1 là x = 1
    * - Gán cộng: +=
    *   VD: x +=y là x = x + y
    * - Gán trừ: -=
    *   VD: x -=y là x = x - y
    * - Gán nhân: *=
    * - Gán chia: /=
    * - Chán chia lấy dư: %=
    * */
    public static void main(String[] args) {
        //gán cộng
        int x = 8;
        x+=5;
        //x = x + 5;
        System.out.println("x = " +x);

        //gán trừ
        int x2 = 8;
        x2-=5;
        //x = x - 5;
        System.out.println("x2 = " +x2);

        /*
        * Các phép so sánh
        * Bằng nhau: 1 == 1 => True
        * Khác nhau: 1 != 1 => False
        * Lớn hơn: 1 > 2 => False
        * Nhỏ hơn: 1 < 2 => True
        * Lớn hơn hoặc bằng: 1 >= 2 => False
        * Nhỏ hơn hoặc bằng: 1 <= 2 => True
        * */

        int a = 7;
        int b = 9;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        // Bài tập
        // Khai báo biến a = 6;
        // Thực hiện các phép tính sau đây và in ra kết quả màn hình
        int z = 6;
        int y = 2;
        System.out.println(z+=3);
        System.out.println(z-=5);
        System.out.println(z*=2);
        System.out.println(z%=3);
        System.out.println(z=z-(y+7));
    }
}
