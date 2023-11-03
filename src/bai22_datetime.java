import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar lich = Calendar.getInstance();
        System.out.println(lich);
        int nam = lich.get(Calendar.YEAR);
        int thang = lich.get(Calendar.MONTH);
        int ngay = lich.get(Calendar.DAY_OF_MONTH);
        System.out.println(ngay+"/"+thang+"/"+nam);

        //setngay theo y muon
        lich.set(Calendar.YEAR,1987);
        lich.set(Calendar.MONTH,5);
        lich.set(Calendar.DAY_OF_MONTH,28);

        int namSinh = lich.get(Calendar.YEAR);
        int thangSinh = lich.get(Calendar.MONTH);
        int ngaySinh = lich.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay thang nam sinh: "
                                        +ngaySinh+"/"
                                        +thangSinh+"/"
                                        +namSinh);

        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh/mm/ss a");
        Date d = lich.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }
}