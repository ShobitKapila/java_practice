package STS_DSA_java;


// For an 2D array
public class MaximumHourglassSum {
    public static int maxHourglassSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= matrix.length - 3; i++) {
            for (int j = 0; j <= matrix[0].length - 3; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j + 1]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("Maximum hourglass sum: " + maxHourglassSum(matrix));
    }
}



// For an 3D integer array

//public class MaximumHourglassSum3D {
//
//    public static int maxHourglassSum(int[][][] matrix) {
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i <= matrix.length - 3; i++) {
//            for (int j = 0; j <= matrix[0].length - 3; j++) {
//                for (int k = 0; k <= matrix[0][0].length - 3; k++) {
//                    int sum = matrix[i][j][k] + matrix[i][j][k + 1] + matrix[i][j][k + 2]
//                            + matrix[i + 1][j + 1][k + 1]
//                            + matrix[i + 2][j][k] + matrix[i + 2][j][k + 1] + matrix[i + 2][j][k + 2];
//                    maxSum = Math.max(maxSum, sum);
//                }
//            }
//        }
//
//        return maxSum;
//    }
//
//    public static void main(String[] args) {
//        int[][][] matrix = {
//            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
//            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
//            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
//        };
//        System.out.println("Maximum hourglass sum: " + maxHourglassSum(matrix));
//    }
//}
