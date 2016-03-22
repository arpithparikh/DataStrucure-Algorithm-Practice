DFS
public class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
        	return 0;
        }
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[0].length; j++) {
        		if(grid[i][j] == '1') {
        			doFill(grid, i, j);
        			count++;
        		}
        	}
        }
        return count;
    }
    private void doFill(char[][] grid, int i, int j) {
    	if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
    		return;
    	}
    	//因为做的就是floodfill填充，跟surround region一样，没必要再回溯
    	grid[i][j] = '0';
    	doFill(grid, i + 1, j);
    	doFill(grid, i - 1, j);
    	doFill(grid, i, j + 1);
    	doFill(grid, i, j - 1);
    }
}

BFS
在BFS的时候，因为不像DFS递归中有自然的退出条件，所以要人工进行判断，还要引入标记数组。
并且是做的BFS，要引入queue
public class Solution {
	public int numIslands(char[][] grid) {
		if(grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		int count = 0;
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] isVisited = new boolean[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(grid[i][j] == '1') {
					Queue<Integer> queue = new LinkedList<Integer>();
					queue.offer(i);
					queue.offer(j);
					while(!queue.isEmpty()) {
						int size = queue.size();
						for(int k = 0; k < size / 2; k++) {
							int xLoc = queue.poll();
							int yLoc = queue.poll();
							grid[xLoc][yLoc] = '0';
							isVisited[xLoc][yLoc] = true;
							if(isValid(xLoc - 1, yLoc, grid, isVisited)) {
								queue.offer(xLoc - 1);
								queue.offer(yLoc);
								grid[xLoc - 1][yLoc] = '0';
								isVisited[xLoc - 1][yLoc] = true;
							}
							if(isValid(xLoc + 1, yLoc, grid, isVisited)) {
								queue.offer(xLoc + 1);
								queue.offer(yLoc);
								grid[xLoc + 1][yLoc] = '0';
								isVisited[xLoc + 1][yLoc] = true;
							}
							if(isValid(xLoc, yLoc - 1, grid, isVisited)) {
								queue.offer(xLoc);
								queue.offer(yLoc - 1);
								grid[xLoc][yLoc - 1] = '0';
								isVisited[xLoc][yLoc - 1] = true;
							}
							if(isValid(xLoc, yLoc + 1, grid, isVisited)) {
								queue.offer(xLoc);
								queue.offer(yLoc + 1);
								grid[xLoc][yLoc + 1] = '0';
								isVisited[xLoc][yLoc + 1] = true;
							}
						}
					}
					count++;
				}
			}
		}
		return count;
	}
	private boolean isValid(int x, int y, char[][] grid, boolean[][] isVisited) {
		if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0' || isVisited[x][y] == true) {
			return false;
		}
		return true;
	}
}