Maximum minimum path
给一个int[][]的matrix，对于一条从左上到右下的path p_i中，p_i中的最小值是m_i,
求所有m_i中的最大值,只能往下或者往右
[8,4,7]
[6,5,9]
有三条path
8 4 7 9 4
8 4 5 9 5
8 6 5 9 5
return 5;

public class Solution {
	public int findMaximum(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}
		ArrayList<ArrayList<Integer>> allPath = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> eachPath = new ArrayList<Integer>();
		helper(matrix, allPath, eachPath, 0, 0);
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < allPath.size(); i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < allPath.get(i).size(); j++) {
				min = Math.min(min, allPath.get(i).get(j));
			}
			max = Math.max(max, min);
		}
		return max;
	}
	private void helper(int[][] matrix, ArrayList<ArrayList<Integer>> allPath, ArrayList<Integer> eachPath,int i, int j) {
		if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
			return;
		}
		if(i == matrix.length - 1 && j == matrix[0].length - 1 ) {
			eachPath.add(matrix[i][j]);
			allPath.add(new ArrayList<Integer>(eachPath));
			return;
		}
		eachPath.add(matrix[i][j]);
		helper(matrix, allPath, eachPath, i + 1, j);
		helper(matrix, allPath, eachPath, i, j + 1);
		eachPath.remove(eachPath.size() - 1);
	}
}

public class Solution {
	public int findMaximum(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}
		ArrayList<Integer> max = new ArrayList<Integer>();
		max.add(Integer.MIN_VALUE);
		doDFS(matrix, 0, 0, Integer.MAX_VALUE, max);
		return max.get(0);
	}
	private void doDFS(int[][] matrix, int i, int j, int crtMin, ArrayList<Integer> max) {
		if(j == matrix[0].length || i == matrix.length) {
			return;
		}
		int temp = Math.min(crtMin, matrix[i][j]);
		doDFS(matrix, i + 1, j, temp, max);
		doDFS(matrix, i, j + 1, temp, max);
		if(i == matrix.length - 1 && j == matrix[0].length - 1) {
			max.set(0, Math.max(max.get(0), temp));
		}
	}
}