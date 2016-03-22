public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] copy = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                copy[i][j] = matrix[i][j];
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(copy[i][j] == 0) {
                    helper(matrix, i, j);
                }
            }
        }
        return;
    }
    private void helper(int[][] matrix, int x, int y) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][y] = 0;
        }
        for(int j = 0; j < matrix[0].length; j++) {
            matrix[x][j] = 0;
        }
    }
}

public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean rowZero = false;
        boolean colZero = false;
        for(int i = 0; i < m; i++) {
            if(matrix[i][0] == 0) {
                colZero = true;
                break;
            }
        }
        for(int i = 0; i < n; i++) {
            if(matrix[0][i] == 0) {
                rowZero = true;
                break;
            }
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(rowZero) {
            for(int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        if(colZero) {
            for(int j = 0; j < m; j++) {
                matrix[j][0] = 0;
            }
        }
    }
}