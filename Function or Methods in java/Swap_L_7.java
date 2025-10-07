import java.util.Scanner;

public class Swap_L_7 {
    public static void main(String[] args) {

        int a = 10 ;
        int b = 20 ;

        // swap numbers code
//        int temp = a ;
//        a = b ;
//        b = temp ;

        swap(a,b);

        System.out.println(a + " "  + b );      // now what it should print, i don't know your answer
        // but let see that how is this internally working

        String name = "Aayush panchal" ;
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam) {
        naam = "Kunal kushwaha" ;
    }

    static void swap(int a, int b)  {
        int temp = a ;
        a = b ;
        b = temp ;
    }



}
