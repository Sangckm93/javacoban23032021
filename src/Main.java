public class Main {

    public static void main(String [] args) throws Exception{
        System.out.print("Hello World");
        /*
         1: Tao thu muc .git
             git init
         2: xem sự thay đổi
             git status
         3: Luu trữ sự thay đổi
             git add .
         4: Lưu trữ vào local repo
             git commit -m "tên message"
         commit: phat tin hieu

         1. comment code
            ctrl + / ,

         2. kiểu dữ liệu
            Nhóm kiểu dữ liệu nguyên thủy: không hỗ trợ phương thức xử lý
                    int , boolean, double, float, char
            Nhóm kiểu dữ liệu đối tượng: Hỗ trợ các phương thức xử lý
                    String, Integer, Boolean, Double, Float, CharSequence

         3. Khai báo biến
            String name = "Nguyễn Đình Sáng";
            int age = 15;
            float s1 = 1.5f;    // f dùng phân biệt giữa kiểu float với double
            double s2 = 1.5;
            char s3 = 'a';  // ký tự
         4. Toán tử:
            Toán hạng: 1, 2, 3,...
            Toán tử: +, -, *, /
            Biểu thức: phải có giá trị trả về

        */

        int a = 5;
        int b = 5;
        int ketqua = a-- + --b + --b - --a + b-- - --a;
        // 5 + --b + --b - --a + b-- - --a;     a = 4, b = 5;
        // 5 + 4 + --b - --a + b-- - --a;     a = 4, b = 4;
        // 5 + 4 + 3 - --a + b-- - --a;     a = 4, b = 3;
        // 5 + 4 + 3 - 3 + b-- - --a;     a = 3, b = 3;
        // 5 + 4 + 3 - 3 + 3 - --a;     a = 3, b = 3;
        // 5 + 4 + 3 - 3 + 2 - 2;     a = 2, b = 2;
        //

        System.out.print(ketqua);

    }
}
