public class Scope_L_7 {
    public static void main(String[] args) {

        int a = 10 ;
        int b = 20 ;
        String name = "Kunal" ;

        {
//          int a = 78 ;    // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100 ;
            System.out.println(a);
            int c = 99 ;    // values initialised in this block, will remain in block
            name = "Rahul" ;
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c);    // cannot use outside the block

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90 ;
//            int a = 10 ;

        }
//        System.out.println(i);

    }

    static void random(int marks)    {
        int num = 67 ;
        System.out.println(num);
        System.out.println(marks);
    }

}
