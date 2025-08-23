import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //type casting
//        int num = (int)(68.84f);
//        System.out.println(num);

        //automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);  //257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//
//        byte b = 50;
//        b = b * 2;
//
//        System.out.println(d);

//        System.out.println(3 * 6);

//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d + s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
