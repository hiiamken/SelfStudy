
public class baitap17_timsohoanhao {
    public static void main(String[] args) {
        /*Số hoàn hảo là số: Tổng các ước thực của nó bằng chính nó
                Ví dụ: 6 = 1+2+3*//*
        Tìm tất cả các số trong phạm vi 1-1000*//*

        *//*int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số cần kiểm tra: ");
        n = sc.nextInt();
        int tong = 0;
        if (n>1000 || n<1) {
            System.out.println("Số bạn nhập đã quá giới hạn đề bài cho");
        } else {
            for (int i = 1; i<n; i++){
                if (n % i == 0){
                    tong += i;
                }
            }
            if (tong == n ) {
                System.out.println(n+ " là số hoàn hảo");
            } else {
                System.out.println(n+ " không là số hoàn hảo");
            }*//*

        }*/

        for (int n=1;n<=1000;n++){
            int tong = 0;
            for (int i=1;i<n;i++){
                if (n%i ==0){
                    tong +=i;
                }
            }
            if (tong == n){
                System.out.println(n+ " là số hoàn hảo");
            }
        }
    }
}
