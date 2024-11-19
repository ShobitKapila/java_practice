package STS_DSA_java;

import java.util.Arrays;

public class KnightsTourWarnsdorff {

    private static final int[] X_MOVES = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] Y_MOVES = {1, 2, 2, 1, -1, -2, -2, -1};

    public static int[][] findKnightsTour(int n) {
        int[][] chessboard = new int[n][n];
        int moveNumber = 1;
        int row = 0;
        int col = 0;
        chessboard[row][col] = moveNumber;

        for (int i = 2; i <= n * n; i++) {
            int[] nextMove = getNextMove(chessboard, row, col);
            row = nextMove[0];
            col = nextMove[1];
            chessboard[row][col] = i;
        }

        return chessboard;
    }

    private static int[] getNextMove(int[][] chessboard, int row, int col) {
        int n = chessboard.length;
        int[] minMove = {-1, -1};
        int minDegree = Integer.MAX_VALUE;

        for (int i = 0; i < 8; i++) {
            int nextRow = row + X_MOVES[i];
            int nextCol = col + Y_MOVES[i];

            if (isValidMove(chessboard, nextRow, nextCol)) {
                int degree = countValidMoves(chessboard, nextRow, nextCol);

                if (degree < minDegree) {
                    minDegree = degree;
                    minMove[0] = nextRow;
                    minMove[1] = nextCol;
                }
            }
        }

        return minMove;
    }

    private static boolean isValidMove(int[][] chessboard, int row, int col) {
        int n = chessboard.length;
        return (row >= 0 && row < n && col >= 0 && col < n && chessboard[row][col] == 0);
    }

    private static int countValidMoves(int[][] chessboard, int row, int col) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nextRow = row + X_MOVES[i];
            int nextCol = col + Y_MOVES[i];
            if (isValidMove(chessboard, nextRow, nextCol)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] knightsTour = findKnightsTour(n);

        for (int[] row : knightsTour) {
            System.out.println(Arrays.toString(row));
        }
    }
}
