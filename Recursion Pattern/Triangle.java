import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        triangle2(4, 0);

        int[] arr = {4, 3, 2, 1};
//        bubble(arr, arr.length-1, 0);
        selection(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col == row) {
            System.out.println();
            triangle(--row, 0);
        }   else {
            System.out.print("* ");
            triangle(row, ++col);
        }
    }

    static void triangle2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col == row) {
            triangle2(row-1, 0);
            if (row != 1) {
                System.out.println();
            }
        }   else {
            triangle2(row, col+1);
            System.out.print("* ");
        }
    }

    static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col+1]) {
                int t = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = t;
            }
            bubble(arr, row, col+1);
        }   else {
            bubble(arr, row-1, 0);
        }
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c <= r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            }   else {
                selection(arr, r, c+1, max);
            }
        }   else {
            int t = arr[r];
            arr[r] = arr[max];
            arr[max] = t;
            selection(arr, r-1, 0, 0);
        }
    }

}
