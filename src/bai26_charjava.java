import java.util.Scanner;

public class bai26_charjava {
    public static void main(String[] args) {
        //khai báo
        char ch = 'a';
        char ch2 = 66; //Khởi tạo
        System.out.println(ch2);
        char ch3; //Khai báo

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 ký tự: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Kí tự vừa nhập là: " +ch4);*/

        //Char method
            //So sánh 2 ký tự => trả về 1 số nguyên (Dùng lớp charater)
        System.out.println(Character.compare('a', 'a'));
        System.out.println(Character.compare('a', 'b'));
        System.out.println(Character.compare('b', 'a'));
            //Kiểm tra có phải số: Character.isDigit
            //Kiểm tra có phải chữ cái: Character.isLetter
            //Kiểm tra có phải space: Character.isWhitespace
            //Kiểm tra có phải ký tự thường: Character.isLowerCase
            //Kiểm tra có phải ký tự viết hoa: Character.isUpperCase

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isUpperCase(ch5));
    }

}
