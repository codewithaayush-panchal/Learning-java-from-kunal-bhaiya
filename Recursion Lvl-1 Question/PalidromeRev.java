
public class PalidromeRev {


    public static void main(String[] args) {
        System.out.println(palin(98338));
    }


    static int rev(int n) {
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

    static boolean palin(int n) {
        return n == rev(n);
    }

}