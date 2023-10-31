public class bai5_khaibaobien {
    /*
    Khai báo BIẾN trong java
    - Biến: là tên gọi của một vùng nhớ, để lưu trữ dữ liệu
    - Java có hai kiểu báo biến

        1. Cho phép thay đổi giá trị của biến trong chương trình
            Khai báo biến/khởi tạo biến: [Kiểu dữ liệu] tên_biến [= giá_trị];
        2. Không cho phép thay đổi giá trị của biến trong hằng số
            Khai báo biến/khởi tạo biến: final [Kiểu dữ liệu] tên_biến [= giá_trị];
    */
    public static void main(String[] args) {
        //Khai báo biến
        int a;
        byte tuoi;
        float diemToan;
        //Khai báo nhiều biê cũng kiểu dữ liệu
        int c,d,e;

        //Khởi tạo biến
        int tuoiCon = 10;
        float diemVan = 7.5f;
        double diemAnh = 7.5;

        tuoiCon = 15;
        System.out.println(tuoiCon);

        //Hằng số
        final int Dosoicuanuoc = 100;
        int tuoicon = 30;


        /*
        - Quy tắc đặt tên biến:
            + Tên biến chỉ chứa chữ cái, chữ số và dấu gạch chân _ và dấu $
            + Tên biến KHÔNG ĐƯỢC bắt đầu bằng chữ số
            + Tên biến KHÔNG ĐƯỢC trùng với từ khoá và từ dành riêng cho Java
            + camelCase: Lạc đà (Chữ cái đầu từ thứ 2 trở đi viết Hoa, còn lại viết thường)
                VD: int tuoiCon = 15;
         */
    }
}
