
public class RevNum {

    static int revNum = 0;

    public static void main(String[] args) {
        rev2(8753);
        System.out.println(rev2(87576));
    }

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        revNum = revNum * 10 + rem;
        rev1(n/10);
    }

    static int rev2(int n) {
        // sometimes you might need some additional variable in arguments in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return (n%10) * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

}