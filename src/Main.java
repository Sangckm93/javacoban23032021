public class Main {

    public static void main(String [] args) throws Exception{
        System.out.println("Hello World");
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
            Số : ++ , -- , // , **

            int a = 5;
            int b = 5;
            int ketqua = a-- + --b - --b - --a + b-- - --a;
             5 + --b - --b - --a + b-- - --a; a = 4 , b = 5
             5 + 4 - --b - --a + b-- - --a; a = 4 , b = 4
             5 + 4 - 3 - --a + b-- - --a; a = 4 , b = 3
             5 + 4 - 3 - 3 + b-- - --a; a = 3 , b = 3
             5 + 4 - 3 - 3 + 3 - --a; a = 3 , b = 2
             5 + 4 - 3 - 3 + 3 - 2; a = 2 , b = 2
             9 - 6 + 1
             4

             System.out.print(ketqua);
          5. Câu điều kiện (if/else)
            {} : scope (phạm vi)
            toán tử 1 ngôi: a+b
            toán tử 2 ngôi : a++, b++
            toán tử ba ngôi:

            biểu thức ? giá trị:gia tri;

            int a = 10;
            int b = 10;
            int ketqua = 0;

            if (a>b) ketqua = 1;
                else if (a==b) ketqua = 0;
                else ketqua = -1;
            vd: ketqua = (a>b)?1:0;
                ketqua = a>b ? 1 : a<b ? -1 : 0;

            if (a>b){
                return; // dừng chương trình tại phương thức này
             }
            System.out.println("Tiếp tục");

           6. cấu trúc switch/ case.

            int thang = 5;
            switch(thang)
            {
                case 1: System.out.print(" Quý 1");
                    break;
                case 2: System.out.print(" Quý 1");
                    break;
                case 3: System.out.print(" Quý 1");
                    break;
                default: System.out.print(" Không thuộc quý nào");
            }
            System.out.print(" Thoát khỏi switch");
        */

        // array : mảng
        // Cách 1: Mảng chưa có dữ liệu
        int[] arrNums = new int[10];
        arrNums[0] = 1;
        System.out.println(arrNums[0]);
        System.out.println(arrNums.length);

        // Cách 2: Mảng có dữ liệu
        int[] arrNums1 = {1,2,3,4,5,6,7};
        System.out.println("arrNums1 :"+ arrNums[0]);
        System.out.println("arrNums1 leng"+ arrNums.length);


        int[] arrNums2 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arrNums2.length; i++) {
            if (arrNums2[i]%2 == 0) {
                if ((arrNums2[i]>5) && (arrNums2[i]<=8)) {
                    continue;
                }
                System.out.println("arrNums2 :" + arrNums2[i]);
            }
        }

    }
}
