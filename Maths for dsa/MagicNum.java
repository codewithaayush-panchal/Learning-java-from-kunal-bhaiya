

public class MagicNum {

    public static void main(String[] args) {

        int n = 5   ;
        isMagic(n);
    }

    static void isMagic(int n) {
        double ans = 0;
        int s = 1;
        while(n!=0) {
            int k = n & 1;
            n = n >> 1;
            ans += k * Math.pow(5, s);
            s++;
        }
        System.out.println(ans);
    }

}
