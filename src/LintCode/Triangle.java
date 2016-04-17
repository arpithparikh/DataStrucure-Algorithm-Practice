package DP;
//Given a triangle, find the minimum path sum from top to bottom. 
//Each step you may move to adjacent numbers on the row below.
/*[
 [2],
[3,4],
[6,5,7],
[4,1,8,3]
]*/
//The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
//using DP top down approach O(N^2).


public class Triangle {
	public static int Solution(int [][] triangle){
		//State
		int n = triangle.length;
		int [][] f = new int[0][0];
		//Equation
		f[0][0] = triangle[0][0];
		for (int i = 1; i < n; i++){
			f[i][0] = f[i-1][0] + triangle[i][0];		
			f[i][i] = f[i-1][i-1] + triangle[i][i];		
		}
		//Initialization
		for (int i = 1; i<n; i++){
			for (int j = 1; j < i; j++) {
                f[i][j] = Math.min(f[i - 1][j], f[i - 1][j - 1]) + triangle[i][j];
            }
		}
		//Answer
        int best = f[n - 1][0];
        for (int i = 1; i < n; i++) {
            best = Math.min(best, f[n - 1][i]);
        }
        return best;
	}

}
