public class AverageDigitsInAString {
    /**
     * Phương thức nhận vào một chuỗi và tính trung bình của các ký tự số trong chuỗi
     * Sinh viên tự hoàn thành chương trình để biến result lưu kết quả của việc tính toán
     * Ví dụ: nếu s là chuỗi hello123 thì result sẽ bằng 2.0
     * @param s
     * @return
     */
    public static double average(String s)
    {
        int sum=0;
        String string ="Hello123";
        for (int i = 0; i <string.length(); i++) {
            char c = string. charAt(i);
            if(c >= '0' && c <= '9')
                sum += c - '0';
        }

        double result = sum/3;
        return  result;
    }
}
