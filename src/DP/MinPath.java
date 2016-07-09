package DP;
public class MinPath {
	public static int Solution(int [][]grid){
		//State
		int M = grid.length;//row
		int N = grid[0].length;//column
		int [][] sum = new int[M][N]; //sum 
		//Equation
		sum[0][0] = grid[0][0];
		for (int i = 1; i < M; i++){
			sum[i][0] = sum[i - 1][0] + grid[i][0];
		}
		for (int j = 1; j<N; j++){
			sum[0][j] = sum[0][j-1] + grid[0][j];
		}
		//Initialization
		for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
            	sum[i][j] = Math.min(sum[i - 1][j], sum[i][j - 1]) + grid[i][j];
            }
        }
		//Result
		return sum[M-1][N-1];
	}
}
