import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true){

            System.out.println("Please enter any operator( +, -, *, /, %): ");
            char op = in.next().trim().charAt(0);

            if ( op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {


                System.out.print("Please enter two numbers:");
                int n1 = in.nextInt();
                int n2 = in.nextInt();


                if ( op == '+') {
                    ans = n1 + n2 ;
                }

                if ( op == '-') {
                    ans = n1 - n2 ;
                }

                if ( op == '*') {
                    ans = n1 * n2 ;
                }

                if ( op == '/')  if ( n2 != 0){
                    ans = n1 / n2 ;
                }

                if ( op == '%') if ( n2 != 0) {
                    ans = n1 % n2 ;
                }




            } else if ( op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!!");
                break;
            }

            System.out.println("Your answer is: " + ans);

        }


    }
}
