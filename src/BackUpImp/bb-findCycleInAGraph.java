find cycle in a graph represented as adjacent matrix
public class Solution {
	public boolean findCycle(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int length = matrix.length;
		int[] root = new int[length];
		for(int i = 0; i < length; i++) {
			root[i] = i;
		}
		for(int i = 0; i < )
	}
}