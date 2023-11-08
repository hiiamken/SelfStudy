public class bai26_1_string {
    public static void main(String[] args) {
        String s = "Hồi đó tôi chê mồm em rộng" +
                "\nKhông tin hai đứa ...";
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        //Phuong thức append: Thêo vào cuối chuỗi
        sb.append("Xin chào, ");
        sb.append("mình mới học lập trình");
        sb.append(", Rất vui được làm quen các bạn");
        System.out.println(sb);

        //7.2 insert (vị trí index, chuỗi cần chèn)
        sb.insert(2,"obama");
        System.out.println(sb);

        //Phương thức delete(start,end)
        sb.delete(2,10);
        System.out.println(sb);

        //Phương thức  length
        System.out.println(sb.length());

        //Buổi 2
        // IndexOf
        // Trả về -1 nếu không tìm thấy
        String s7 = "tôi đi tìm tôi";
        System.out.println(s7.indexOf("tôi"));

        // LastIndexOf
        System.out.println(s7.lastIndexOf("tôi"));

        // Contains:
        String s9 = ".mp3";
        String s10 = "tuhoc.mp3";
        //Kiểm tra s10 có cụm string của s9 không
        boolean check = s10.contains(s9);
        if (check)
            System.out.println("Có .mp3 trong chuỗi");
        else
            System.out.println("Không tìm thấy .mp3");


        //Sub String
        // subString(int beginIndex)
        // substring(int beginIndex, int endIndex)
        String s11 = "ádasdasd";
        String s12 = s11.substring(4,6);
        System.out.println(s11);
        System.out.println(s12);

        //Replace
        String s14 = "học học nữa học mãi";
        String s15 = s14.replace("học","ngủ");
        String s16 = s14.replaceFirst("học","ngủ");
        System.out.println(s15);
        System.out.println(s16);

        //Trim(): Xoá hết khoảng trắng ở đàu và cuối
        String s17 = "            Hhehe     ";
        String s19 = s17.trim();
        System.out.println(s19);

            // Xoá toa bộ khoảng trắng cuối
                // \s+ : một hoặc nhiều khoang trắng liên tiếp
                // $ : kết thúc dòng
                // \s+$: một hặc nhiều khoảng trắng liên tiếp kết thúc dòng
        String s20 = s17.replaceAll("\\s+$","");
        String s21 = s17.replaceAll("$","");
        System.out.println(s17.length());
        System.out.println(s20.length());
        System.out.println(s21.length());

        // Cách 2:
        String s22 = " Gà lại lâp trình     ";
        while (s22.endsWith(" ")){
            s22 = s22.substring(0,s22.length()-1);
        }
        System.out.println(s22);

        // 7.13 trim(): Xoá toàn bộ khoảng trắng ở đầu
        // Cách 1: dùng biểu thức chính quy
        // Dùng ^\\s+ để xoá tất cả khoảng trắng ở đầu chuôi
        String s23 = "                Gà lại lập trình           ";
        String s24 = s23.replaceFirst("^\\s+","");
        System.out.println(s23);
        System.out.println(s24);

        // Cách 2: Dùng vòng lặp
        String s25 = "      Gà gà gà    ";
        while (s25.startsWith(" ")){
            s25 = s25.substring(1);
        }
        System.out.println(s25);
    }
}
