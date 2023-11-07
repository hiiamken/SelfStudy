import java.util.Calendar;
import java.util.Scanner;

public class bai22_viduvandung {
    public static void main(String[] args) {
        int day, month, year, tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào ngày sinh: ");
        day = sc.nextInt();
        System.out.println("Mời nhập vào tháng sinh: ");
        month = sc.nextInt();
        System.out.println("Mời nhập vào năm sinh: ");
        year = sc.nextInt();

        Calendar birthday = Calendar.getInstance();
        birthday.set(year,month-1,day);
        //Xuất ngày tháng năm sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DATE);
        System.out.println("Ngày tháng năm sinh: "
                +ngaySinh+ "/"
                +(thangSinh+1)+ "/"
                +namSinh);

        //tính tuổi
        //năm hiện tại
        Calendar now = Calendar.getInstance();
        int namHientai = now.get(Calendar.YEAR);
        tuoi = namHientai-namSinh;
        System.out.println("Tuổi của bạn là: " +tuoi);
    }
}
