import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no1 = input.nextInt();
        int no2 = input.nextInt();

        int sum = no1 + no2;
        System.out.println("Sum = " + sum);
    }
}
