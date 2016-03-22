import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> getNum(int num1, int num2) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(num1);
		temp.add(num2);
		Queue<ArrayList<Integer>> queue = new LinkedList<ArrayList<Integer>>();
		queue.offer(temp);
		helper(res, queue);
		return res;
	}
	private void helper(ArrayList<ArrayList<Integer>> res, Queue<ArrayList<Integer>> queue) {
		while(!queue.isEmpty()) {
			boolean find = false;
			ArrayList<Integer> temp = queue.poll();
			int size = temp.size();
			HashSet<Integer> set = new HashSet<Integer>();
			for(int i = 0; i < size; i++) {
				set.add(temp.get(i));
			}
			for(int i = 0; i < size - 1; i++) {
				int diff = Math.abs(temp.get(i) - temp.get(i + 1));
				if(set.contains(diff)) {
					continue;
				}
				else {
					find = true;
				}
				set.add(diff);
				temp.add(diff);
				queue.offer(new ArrayList<temp>());
				for(Integer item : result) {
                	System.out.print(item + " ");
                }
                System.out.println(" ");
                temp.remove(temp.size() - 1);
			}
			if(!find) {
				res.add(new ArrayList<Integer>(temp));
			}
		}
	}
}