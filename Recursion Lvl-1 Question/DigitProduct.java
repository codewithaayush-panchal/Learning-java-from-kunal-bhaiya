public class DigitProduct {
    public static void main(String[] args) {
        int ans = digitProduct(50);
        System.out.println(ans);
    }

    static int digitProduct(int n) {
        if (n % 10 == n) {
            return n;
        }
        return digitProduct(n/10) * (n%10);
    }

}
