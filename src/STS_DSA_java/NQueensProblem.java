package STS_DSA_java;

import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        solveNQueensHelper(n, 0, new int[n], result);
        return result;
    }

    public static void solveNQueensHelper(int n, int row, int[] colPlacement, List<List<String>> result) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(colPlacement[i] == j ? 'Q' : '.');
                }
                solution.add(sb.toString());
            }
            result.add(solution);
        } else {
            for (int col = 0; col < n; col++) {
                boolean canPlace = true;
                for (int i = 0; i < row; i++) {
                    if (colPlacement[i] == col || Math.abs(col - colPlacement[i]) == row - i) {
                        canPlace = false;
                        break;
                    }
                }
                if (canPlace) {
                    colPlacement[row] = col;
                    solveNQueensHelper(n, row + 1, colPlacement, result);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);

        System.out.println("Solutions:");
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

