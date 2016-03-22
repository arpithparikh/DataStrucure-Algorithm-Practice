时间复杂度On2 空间O1
public class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
        	return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(grid[i][j] == '1') {
        			count++;
        			doFill(grid, i, j);
        		}
        	}
        }
        return count;
    }
    private void doFill(char[][] grid, int i, int j) {
    	if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || grid[i][j] == '#') {
    		return;
    	}
    	grid[i][j] = '#';
    	doFill(grid, i + 1, j);
    	doFill(grid, i - 1, j);
    	doFill(grid, i, j + 1);
    	doFill(grid, i, j - 1);
    }
}