public class SumOfOdds {
    /**
     * phương thức tính tổng các số lẻ từ 1 đến n
     * sinh viên phải thực hiện tính toán sao cho biến sum chứa tổng các số lẻ
     * ví dụ, nếu n là 5 thì sum sẽ bằng 9 (9 = 1 + 3 + 5)
     * @param n
     * @return
     */
    public static int sumOfOdds(int n){
        int sum = 0;
        for(int i = 0; i<=n ;i++)
            if (i%2==1)
                sum+= i;
        System.out.println("sum"+sum);
        return sum;
    }
}
