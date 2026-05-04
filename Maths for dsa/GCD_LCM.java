
public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(224, 105));
        System.out.println(lcm(2, 7));
    }


    static int gcd(int a, int b) {
        if(Math.min(a, b) == 0) {
            return Math.max(a, b);
        }
        return gcd(Math.max(a, b) % Math.min(a, b), Math.min(a, b));
    }

    static int lcm(int a,  int b) {
        return a*b / gcd(a, b);
    }

}
