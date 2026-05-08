import javax.swing.plaf.synth.SynthRootPaneUI;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,8,4,5};
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int i) {
        // base condition
        if (i + 1 == arr.length) {
            return true;
        }
        return arr[i] < arr[i+1] && sort(arr, i+1);
    }
}
