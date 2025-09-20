public class Conditionals {
    public static void main(String[] args) {
        /*
                Syntax of if statements:

                if (boolean expression T and F) {
                    // body
                }   else {
                       // do this
                }
         */

//        int salary = 25400;
//
//        if (salary > 10000) {
//            salary = salary + 2000;
//        }   else {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        //multiple if-else

        int salary = 25400;

        if (salary > 10000) {
            salary += 2000; // can also write salary += 2000
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);
    }
}