import java.util.function.DoubleToIntFunction;

public class DigitSum {
    public static void main(String[] args) {
        int ans = digitSum(1342);
        System.out.println(ans);
    }

    static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return digitSum(n/10) + (n%10);
    }

}
