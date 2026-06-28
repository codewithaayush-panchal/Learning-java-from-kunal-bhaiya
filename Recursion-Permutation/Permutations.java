import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");
        ArrayList<String> ans = permutationsReturn("", "abc");
        System.out.println(ans);

        System.out.println(permutationsCount("", "abc"));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);

            permutations(f + ch + s, up.substring(1));
        }

    }

    static ArrayList<String> permutationsReturn(String p, String up) {
        ArrayList<String> ans = new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);

            ArrayList<String> x = permutationsReturn(f + ch + s, up.substring(1));
            ans.addAll(x);
        }

        return ans;
    }

    static int permutationsCount(String p, String up) {
        int c = 0;

        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);

            c += permutationsCount(f + ch + s, up.substring(1));
        }

        return c;
    }

}
