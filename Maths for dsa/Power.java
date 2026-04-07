
public class Power {

    public static void main(String[] args) {
        int base = 2;
        int exponent = 4;
        double ans = 1;
        int t = 0;
        while(exponent != 0) {
            if ( (exponent & 1) == 1 ) {
                ans = ans * Math.pow(base, Math.pow(2, t));
            }
            t++;
            exponent = exponent >> 1;
        }
        System.out.println(ans);
    }

}
