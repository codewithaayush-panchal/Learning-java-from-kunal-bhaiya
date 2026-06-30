import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

//        System.out.println(count(3,3));
        path("", 3, 3);
        System.out.println();
//        ArrayList<String> ans = pathRetDiagonal("", 3, 3);
//        System.out.println(pathRet("", 3, 3));
//        System.out.println(ans);

        pathRestriction("", 3, 3);
        System.out.println();
        boolean[][] arr = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestriction2("", arr, 0, 0);

    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int ans = 0;
        ans += count(r-1,  c) + count(r, c-1);

        return ans;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r == 1) {
            path(p+"R", r, c-1);
        }   else if (c == 1) {
            path(p+"D", r-1, c);
        }   else {
            path(p + "D", r - 1, c);
            path(p + "R", r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> t = new ArrayList<>();
            t.add(p);
            return t;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r == 1) {
            ans.addAll(pathRet(p+"R", r, c-1));
        }   else if (c == 1) {
            ans.addAll(pathRet(p+"D", r-1, c));
        }   else {
            ans.addAll(pathRet(p + "D", r - 1, c));
            ans.addAll(pathRet(p + "R", r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> t = new ArrayList<>();
            t.add(p);
            return t;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r == 1) {
            ans.addAll(pathRet(p+"R", r, c-1));
        }   else if (c == 1) {
            ans.addAll(pathRet(p+"D", r-1, c));
        }   else {
            ans.addAll(pathRetDiagonal(p + "D", r - 1, c));
            ans.addAll(pathRetDiagonal(p + "R", r, c - 1));
            ans.addAll(pathRetDiagonal(p+"d", r-1, c-1));
        }
        return ans;
    }

    static void pathRestriction(String p, int r, int c) {
        if (r == 2 && c == 2) {
            return;
        }
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r == 1) {
            pathRestriction(p+"R", r, c-1);
        }   else if (c == 1) {
            pathRestriction(p+"D", r-1, c);
        }   else {
            pathRestriction(p + "D", r - 1, c);
            pathRestriction(p + "R", r, c - 1);
        }
    }

    static void pathRestriction2(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length-1) {
            pathRestriction2(p+"D", maze, r+1, c);
        }
        if (c < maze[0].length-1) {
            pathRestriction2(p+"R", maze, r, c+1);
        }
    }


}
