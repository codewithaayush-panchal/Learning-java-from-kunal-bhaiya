import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {

      int n = 287563275;
      int count = 0;

      while ( n > 0 ) {
          int rem = n % 10;
          if (rem == 5) {
              count +=1 ;
          }
          n = n / 10; // also can write n /= 10;
      }
        System.out.println(count);





    }
}
