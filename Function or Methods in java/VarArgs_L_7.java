import java.util.Arrays;

public class VarArgs_L_7 {

    public static void main(String[] args) {

//        fun();
//        multiple( 3, 5 , "Kunal" , "Aayush");
//        demo();

    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple( int a , int b , String ...v) {

    }

    static void fun(int ...v )  {
        System.out.println(Arrays.toString(v));
    }
}
