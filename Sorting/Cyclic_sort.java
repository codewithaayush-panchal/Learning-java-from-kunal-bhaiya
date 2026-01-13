import java.lang.reflect.Array;
import java.util.Arrays;

//public class Cyclic_sort {
//    public static void main(String[] args) {
//
//        int[] a = {3, 5, 2, 1, 4} ;
//        CyclicSort(a);
//        System.out.println(Arrays.toString(a));
//
//    }
//
//    static void CyclicSort(int[] a) {
//
//        for ( int i = 0 ; i < a.length ; i++ ) {
//            if ( a[i] - 1 != i ) {
//                int temp = a[i] ;
//                int t = a[i] ;
//                a[i] = a[a[i]-1] ;
//                a[t-1] = temp ;
//                i-- ;
//            }
//        }
//
//    }
//
//}

    // kunal bhai told to do it by yourself and i did it...


public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}



