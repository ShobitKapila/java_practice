package STS_DSA_java;

public class MazeSolver {

    public static boolean solveMaze(int[][] maze, int startRow, int startCol, int endRow, int endCol) {
        if (startRow < 0 || startRow >= maze.length || startCol < 0 || startCol >= maze[0].length || maze[startRow][startCol] == 0) {
            return false;
        }

        if (startRow == endRow && startCol == endCol) {
            return true;
        }

        maze[startRow][startCol] = 0; // Mark the current cell as visited

        if (solveMaze(maze, startRow + 1, startCol, endRow, endCol) ||
                solveMaze(maze, startRow - 1, startCol, endRow, endCol) ||
                solveMaze(maze, startRow, startCol + 1, endRow, endCol) ||
                solveMaze(maze, startRow, startCol - 1, endRow, endCol)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1}
        };

        int startRow = 0;
        int startCol = 0;
        int endRow = 4;
        int endCol = 4;

        boolean result = solveMaze(maze, startRow, startCol, endRow, endCol);
        System.out.println("Can the maze be solved? " + result);
    }
}
