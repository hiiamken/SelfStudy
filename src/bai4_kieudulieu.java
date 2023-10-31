public class bai4_kieudulieu {
    /*Các kiểu dữ liệu
    - Kiểu luận lý : boolean
    - Kiểu ký tự: char
    - Kiểu số:
    + Số nguyên:
       > byte : -127 -> 127
       > short : -32768 -> 32768
       > int : -2 triệu -> 2 triệu
       > long : -9 tỉ tỉ -> 9 tỉ tỉ
    + Số thực:
       > float
       > double
    */

    /*Các kiểu cơ sở:
    - boolean                           Wrapper class: Tên ở chữ cái đầu tiên đều viết hoa
    - char                                            Riêng int = Integer
    - byte
    - short
    - int
    - long
    - float
    - double
    */

    public static void main(String[] args) {
        //kiểm tra kiểu nguyên
        System.out.println("min của kiểu int " +Integer.MIN_VALUE);
        System.out.println("max của kiểu int " +Integer.MAX_VALUE);

        //kiểm tra kiểu byte
        System.out.println("min của kiểu byte " +Byte.MIN_VALUE);
        System.out.println("max của kiểu byte " +Byte.MAX_VALUE);
    }
}
