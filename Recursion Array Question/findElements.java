import java.util.ArrayList;
import java.util.Arrays;

public class findElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
//        System.out.println(find(arr, 4, 0));
//        System.out.println(findIndex(arr, 4, 0));
//        System.out.println(findIndexFromlast(arr, 4, arr.length-1));
//
//        findAllIndex(arr, 4, 0);
//        System.out.println(arrayList);
//
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        findAllIndex2(arr, 4, 0, arrayList1);
//        System.out.println(arrayList1);
//
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        System.out.println(findAllIndex3(arr, 4, 0, arrayList2));

        System.out.println(findAllIndex4(arr, 4, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index+1);
    }

    static int findIndexFromlast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index-1);
    }

    static ArrayList<Integer> arrayList = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            arrayList.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static void findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> arrayList) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            arrayList.add(index);
        }
        findAllIndex2(arr, target, index+1, arrayList);
    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index, ArrayList<Integer> arrayList) {
        if (index == arr.length) {
            return arrayList;
        }
        if (arr[index] == target) {
            arrayList.add(index);
        }
        return findAllIndex3(arr, target, index+1, arrayList);
    }

    static ArrayList<Integer> findAllIndex4(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCall = findAllIndex4(arr, target, index+1);
        list.addAll(ansFromBelowCall);
        return list;
    }

}
