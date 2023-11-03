public class bai21_hamtrongjava {
    public static void main(String[] args) {
        int kq = Cong(1,2,3);
        System.out.println(kq);
        //goi ham chao xin
        Xinchao("male");

    }

    public static int Cong(int x, int y, int z){
        return x+y+z;
    }

    //Ham thu tuc
    public static void Xinchao(String gioitinh){
        if(gioitinh.equals("female"))
            System.out.println("Woman");
        else if (gioitinh.equals("male"))
            System.out.println("Man");
    }
}
