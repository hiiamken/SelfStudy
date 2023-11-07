import jdk.swing.interop.SwingInterOpUtils;

public class bai23_math {
    public static void main(String[] args) {
        System.out.println("Pi = " +Math.PI);
        //Trị tuyệt đối
        int a = -8;
        System.out.println("|a|= " +Math.abs(a));
        //max,min
        System.out.println(Math.max(4,7));
        System.out.println(Math.min(4,7));
        //căn bậc 2
        System.out.println(Math.sqrt(4));
        //sin,cos,tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.sin(Math.PI*goc/180);
        double tan = Math.sin(Math.PI*goc/180);
        System.out.println("sin 90 = " +sin);
        System.out.println("cos 90 = " +cos);
        System.out.println("tan 90 = " +tan);
    }
}
