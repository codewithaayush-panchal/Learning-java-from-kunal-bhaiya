
public class    Stream {
    public static void main(String[] args) {
        skip("", "baccdah");
        System.out.println(skip2("baccdahavl"));
        System.out.println(skipAppNotApple("bappplea"));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.charAt(0) != 'a') {
            p = p + up.charAt(0);
        }

        skip(p, up.substring(1));
    }

    static String skip2(String up) {
        String p = "";
        if (up.isEmpty()) {
            return p;
        }

        if (up.charAt(0) != 'a') {
            p = p + up.charAt(0);
        }

        return p + skip2(up.substring(1));
    }

    static String skipApple(String up) {
        String p = "";
        if (up.isEmpty()) {
            return p;
        }

        if (up.startsWith("apple")) {
            return p + skipApple(up.substring(5));
        }

        return up.charAt(0) + skipApple(up.substring(1));
    }


    static String skipAppNotApple(String up) {
        String p = "";
        if (up.isEmpty()) {
            return p;
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return p + skipAppNotApple(up.substring(3));
        }

        return up.charAt(0) + skipAppNotApple(up.substring(1));
    }

}
