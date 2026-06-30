import java.util.ArrayList;
import java.util.Arrays;

public class Subseq {
    public static void main(String[] args) {
//        subseq("", "abc");
        System.out.println(subseq2("", "abc"));
//        System.out.println(subseqAscii2("", "abc"));
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        subseq(p + up.charAt(0), up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseq2(String p, String up) {
        ArrayList<String> ans = new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        ans.addAll(subseq2(p + up.charAt(0), up.substring(1)));
        ans.addAll(subseq2(p, up.substring(1)));

        return ans;
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        subseqAscii(p + up.charAt(0), up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (up.charAt(0)+0), up.substring(1));

    }

    static ArrayList<String> subseqAscii2(String p, String up) {
        ArrayList<String> ans = new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        ans.addAll(subseqAscii2(p + up.charAt(0), up.substring(1)));
        ans.addAll(subseqAscii2(p, up.substring(1)));
        ans.addAll(subseqAscii2(p + (up.charAt(0)+0), up.substring(1)));

        return ans;
    }

}
