
public class N_Knights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(nKnightsCount(board, 0, 0,3));

    }

    static void nKnights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        if (col == board.length) {
            nKnights(board, row+1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col+1, knights-1);
            board[row][col] = false;
        }

        nKnights(board, row, col+1, knights);

    }

    static int nKnightsCount(boolean[][] board, int row, int col, int knights) {
        int count = 0;
        if (knights == 0) {
            display(board);
            System.out.println();
            return 1;
        }

        if (row == board.length) {
            return 0;
        }

        if (col == board.length) {
            return nKnightsCount(board, row+1, 0, knights);
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += nKnightsCount(board, row, col+1, knights-1);
            board[row][col] = false;
        }

        count += nKnightsCount(board, row, col+1, knights);

        return count;

    }

    private static boolean isSafe(boolean[][] board, int i, int j) {
        if (i-2 > -1) {
            if (j-1 > -1) {
                if (board[i-2][j-1]) {
                    return false;
                }
            }
            if (j+1 < board[0].length) {
                if (board[i-2][j+1]) {
                    return false;
                }
            }
        }
        if (i+2 < board.length) {
            if (j-1 > -1) {
                if (board[i+2][j-1]) {
                    return false;
                }
            }
            if (j+1 < board[0].length) {
                if (board[i+2][j+1]) {
                    return false;
                }
            }
        }
        if (j-2 > -1) {
            if (i-1 > -1) {
                if (board[i-1][j-2]) {
                    return false;
                }
            }
            if (i+1 < board[0].length) {
                if (board[i+1][j-2]) {
                    return false;
                }
            }
        }
        if (j+2 < board[0].length) {
            if (i-1 > -1) {
                if (board[i-1][j+2]) {
                    return false;
                }
            }
            if (i+1 < board.length) {
                if (board[i+1][j+2]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                }   else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}

// solution of K^2

//package com.kunal.backtracking;
//
//public class NKnights {
//    public static void main(String[] args) {
//        int n = 4;
//        boolean[][] board = new boolean[n][n];
//        knight(board, 0, 0, 4);
//    }
//
//    static void knight(boolean[][] board, int row, int col, int knights) {
//        if (knights == 0) {
//            display(board);
//            System.out.println();
//            return;
//        }
//
//        if (row == board.length - 1 && col == board.length) {
//            return;
//        }
//
//        if (col == board.length) {
//            knight(board, row + 1, 0, knights);
//            return;
//        }
//
//        if (isSafe(board, row, col)) {
//            board[row][col] = true;
//            knight(board, row, col + 1, knights - 1);
//            board[row][col] = false;
//        }
//
//        knight(board, row, col + 1, knights);
//    }
//
//    private static boolean isSafe(boolean[][] board, int row, int col) {
//        if (isValid(board, row - 2, col - 1)) {
//            if (board[row - 2][col - 1]) {
//                return false;
//            }
//        }
//
//        if (isValid(board, row - 1, col - 2)) {
//            if (board[row - 1][col - 2]) {
//                return false;
//            }
//        }
//
//        if (isValid(board, row - 2, col + 1)) {
//            if (board[row - 2][col + 1]) {
//                return false;
//            }
//        }
//
//        if (isValid(board, row - 1, col + 2)) {
//            if (board[row - 1][col + 2]) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    // do not repeat yourself, hence created this function
//    static boolean isValid(boolean[][] board, int row, int col) {
//        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
//            return true;
//        }
//        return false;
//    }
//
//    private static void display(boolean[][] board) {
//        for(boolean[] row : board) {
//            for(boolean element : row) {
//                if (element) {
//                    System.out.print("K ");
//                } else {
//                    System.out.print("X ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
