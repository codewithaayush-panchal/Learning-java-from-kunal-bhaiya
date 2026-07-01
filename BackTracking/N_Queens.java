
public class N_Queens {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[4][4];

        System.out.println(nQueens(0, arr));

    }

    static int nQueens(int r, boolean[][] board) {
        if (r == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, r, col)) {
                board[r][col] = true;
                count += nQueens(r+1, board);
                board[r][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int col) {

        // check vertically upward
        for (int i = r-1; i > -1; i--) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(r, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[r-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(r, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[r-i][col+i]) {
                return false;
            }
        }

        return true;

    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                }   else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
