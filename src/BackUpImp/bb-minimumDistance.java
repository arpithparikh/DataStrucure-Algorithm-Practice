给定matrix，
0 0 0
B G G
0 0 0
找到每个0到G的最短距离，B是障碍。
输出：
2 1 1
B G G
2 1 1

public class Solution {
	public Character[][] findDistance(Character[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return matrix;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		boolean[][] isVisited = new boolean[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(matrix[i][j] == 'G') {
					doBFS(matrix, i, j, isVisited);
				}
			}
		}
		return matrix;
	}
	private void doBFS(Character[][] matrix, int i, int j, boolean[][] isVisited) {
		if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 'B' || matrix[i][j] == 'G' || isVisited[i][j] = true) {
			return;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(i);
		queue.offer(j);
		int count = 1;
		while(!queue.isEmpty()) {
			int xLoc = queue.poll();
			int yLoc = queue.poll();
			isVisited[xLoc][yLoc] = true;
			if(isValid(matrix, xLoc + 1, yLoc, isVisited)) {
				queue.offer(xLoc + 1);
				queue.offer(yLoc);
				matrix[xLoc + 1][yLoc] = count;
			}
			if(isValid(matrix, xLoc - 1, yLoc, isVisited)) {
				queue.offer(xLoc - 1);
				queue.offer(yLoc);
				matrix[xLoc - 1][yLoc] = count;
			}
			if(isValid(matrix, xLoc, yLoc + 1, isVisited)) {
				queue.offer(xLoc);
				queue.offer(yLoc + 1);
				matrix[xLoc][yLoc + 1] = count;
			}
			if(isValid(matrix, xLoc, yLoc - 1, isVisited)) {
				queue.offer(xLoc);
				queue.offer(yLoc - 1);
				matrix[xLoc][yLoc - 1] = count;
			}
			count++;
		}
	}
	private boolean isValid(Character[][] matrix, int i, int j, boolean[][] isVisited) {
		if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || isVisited[i][j] == true || matrix[i][j] == 'G' || matrix[i][j] == 'B') {
			return false;
		}
		return true;
	}
}