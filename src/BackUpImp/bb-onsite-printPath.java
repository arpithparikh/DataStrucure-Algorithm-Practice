import java.util.*;
public class printPath {
	public ArrayList<String> findPath(char[][] matrix) {
		ArrayList<String> res = new ArrayList<String>();
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return res;
		}
		StringBuffer sb = new StringBuffer();
		helper(matrix, 0, 0, sb, res);
		return res;
	}
	private void helper(char[][] matrix, int i, int j, StringBuffer sb, ArrayList<String> res) {
		if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
			return;
		}
		sb.append(matrix[i][j]);
		if(i == matrix.length - 1 && j == matrix[0].length - 1) {
			res.add(new String(sb));
		}
		helper(matrix, i + 1, j, sb, res);
		helper(matrix, i, j + 1, sb, res);
		sb.deleteCharAt(sb.length() - 1);
	}
	public static void main(String[] args) {
		printPath p = new printPath();
		char[][] matrix = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
		ArrayList<String> res = p.findPath(matrix);
		for(String str : res) {
			System.out.println(str);
		}
	}
}
