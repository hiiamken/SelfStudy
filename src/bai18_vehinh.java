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
        System.out.println("");

        //vẽ hình tam giác cân
        for (int i = 1; i <= 4; i++) {
            // In dấu cách để căn giữa tam giác
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(""+"\t");
            }

            // In dấu '*' cho phần tam giác
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"+"\t");
            }

            System.out.println(); // Xuống dòng sau khi hoàn thành mỗi dòng
        }

        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            // In dấu cách để căn giữa tam giác và làm cho tam giác cân hở
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  ");
            }

            // In dấu '*' cho phần tam giác
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == 10) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println(); // Xuống dòng sau khi hoàn thành mỗi dòng
        }

        //hinh i
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 7; j++) {
                if (i <= j && (i + j <= 8)) {
                    System.out.print("*" + "  ");
                } else {
                    System.out.print(" " + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        //hinh k
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i >= j) && ((i - j) <= 3)) {
                    System.out.print("*" + "  ");
                } else {
                    System.out.print(" " + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        //hinh l
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i >= j) && ((i - j) <= 3)) {
                    if ((i == 3 && j == 2) || (i == 4 && j == 2) || (i == 4 && j == 3) || (i == 5 && j == 3)) {
                        System.out.print(" " + "  ");
                    } else {
                        System.out.print("*" + "  ");
                    }
                } else {
                    System.out.print(" " + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        // hinh m
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 4 || (i <= 4 && i >= j) || (i >= 4 && j >= i)) {
                    System.out.print("*" + "  ");
                } else {
                    System.out.print(" " + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        // hinh n
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 4 || (i <= 4 && i >= j) || (i >= 4 && j >= i)) {
                    if ((i == 3 && j == 2) || (i == 5 && j == 6)) {
                        System.out.print(" " + "  ");
                    } else {
                        System.out.print("*" + "  ");
                    }
                } else {
                    System.out.print(" " + "  ");
                }
            }
            System.out.println("");
        }
    }
}
