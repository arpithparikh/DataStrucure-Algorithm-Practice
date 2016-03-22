public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates, res, temp, target, 0);
        return res;
    }
    private void helper(int[] candidates, List<List<Integer>> res, List<Integer> temp, int target, int index) {
        if(target < 0) {
            return;
        }
        if(target == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = index; i < candidates.length; i++) {
            if(i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            temp.add(candidates[i]);
            target -= candidates[i];
            helper(candidates, res, temp, target, i + 1);
            temp.remove(temp.size() - 1);
            target += candidates[i];
        }
    }
}