
public class Steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(41));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int i) {
        if (num == 0) {
            return i;
        }
        if (num % 2 == 0) {
            num /= 2;
        }   else {
            num -= 1;
        }
        return helper(num, i+1);
    }

}
