import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temp in C; ");
        float celciusvalue = input.nextFloat();

        float fahreneitevalue = (celciusvalue * 9 / 5) + 32;
        System.out.println(fahreneitevalue);

    }
}
