public class bai18_vehinh {
    public static void main(String[] args) {
        //vẽ hình hình vuông kín
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print("*"+"\t");
            }
            System.out.println(""+"\t");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //ve hinh vuong rong~
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (i == 1 || j == 1 || i == 4 || j == 4) {
                    System.out.print("*"+"\t");
                } else {
                    System.out.print(""+"\t");
                }
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        //tam giac vuong kin
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        //tam giac vuong ho
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                if (i==3 && j==2) {
                    System.out.print(""+"\t");
                } else {
                    System.out.print("*"+"\t");
                }
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        //tam giac vuong kin
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        //tam giac vuong ho
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5-i;j++){
                if (i==2 && j==2) {
                    System.out.print(""+"\t");
                } else {
                    System.out.print("*"+"\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");

        //tam giac vuong kin
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (j >= 5 - i) {
                    System.out.print("*"+"\t");
                } else {
                    System.out.print(""+"\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        //tam giac vuong ho
        for (int i=1;i<=4;i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 3 && i == 3) {
                    System.out.print("" + "\t");
                } else if (j >= 5 - i) {
                    System.out.print("*" + "\t");
                } else {
                    System.out.print("" + "\t");
                }
            }
            System.out.println("");
        }
    }
}
