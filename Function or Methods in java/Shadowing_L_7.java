public class Shadowing_L_7 {

    static int x = 90 ; // this will be shadowed at line 8
    public static void main(String[] args) {

        System.out.println(x); // 90
//        int x = 40 ;    // the class variable at line 4 is shadowed by this

        int x ;
//        System.out.println(x);  // it will show error, scope will begin when the value will initialised.
        x = 40 ;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }

}
