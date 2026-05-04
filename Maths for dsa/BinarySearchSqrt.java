
public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.printf("%.3f", sqrt(n, p));

    }

    // Time = O(long(n))
    static double sqrt(int n, int p) {
        double s = 0;
        double e = n;
        double m = s + (e - s) / 2;
        while (s <= e) {
            m = s + (e - s) / 2;
            if ( m * m == n ) {
                return m;
            }
            if ( m * m > n ) {
                e = m - 1;
            }   else {
                s = m + 1;
            }
        }

        double incr = 0.1;
        for ( int i = 1; i <= p; i++ ) {
            while (m * m <= n) {
                m += incr;
            }
            m -= incr;
            incr /= 10;
        }
        return m;
    }

}
