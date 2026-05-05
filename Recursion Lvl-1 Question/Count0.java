
public class Count0 {
    public static void main(String[] args) {
        System.out.println(count(260705));
    }

    static int count(int n) {
         return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return helper(n/10, count);
    }

}
