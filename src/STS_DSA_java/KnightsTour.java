package STS_DSA_java;

import java.util.Arrays;

public class KnightsTour {

    private static final int[] X_MOVES = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] Y_MOVES = {1, 2, 2, 1, -1, -2, -2, -1};

    public static int[][] findKnightsTour(int n) {
        int[][] chessboard = new int[n][n];
        chessboard[0][0] = 1;

        if (solveKnightsTour(chessboard, 1, 0, 0)) {
            return chessboard;
        }

        return new int[n][n]; // If no solution found, return an empty chessboard
    }

    private static boolean solveKnightsTour(int[][] chessboard, int moveNumber, int row, int col) {
        if (moveNumber == chessboard.length * chessboard.length) {
            return true; // All squares are visited, the tour is complete.
        }

        for (int i = 0; i < 8; i++) {
            int nextRow = row + X_MOVES[i];
            int nextCol = col + Y_MOVES[i];

            if (isValidMove(chessboard, nextRow, nextCol)) {
                chessboard[nextRow][nextCol] = moveNumber + 1;

                if (solveKnightsTour(chessboard, moveNumber + 1, nextRow, nextCol)) {
                    return true;
                }

                chessboard[nextRow][nextCol] = 0; // Backtrack
            }
        }

        return false;
    }

    private static boolean isValidMove(int[][] chessboard, int row, int col) {
        int n = chessboard.length;
        return (row >= 0 && row < n && col >= 0 && col < n && chessboard[row][col] == 0);
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] knightsTour = findKnightsTour(n);

        for (int[] row : knightsTour) {
            System.out.println(Arrays.toString(row));
        }
    }
}

