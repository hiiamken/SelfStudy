public class baitap16_tinhtonggiaithua {
    public static void main(String[] args) {
        int m = 1;
        int tong = 0;
        for (int i = 1;i<=10;i++){
            m *= i;
            tong += m;
        }
        System.out.println("Tổng S = 1! + 2! + ... + 10! = " +tong);
    }
}
