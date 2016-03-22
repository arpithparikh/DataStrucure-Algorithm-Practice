public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        if(candidates == null || candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        helper(candidates, res, temp, target, 0);
        return res;
    }
    private void helper(int[] candidates, List<List<Integer>> res, List<Integer> temp, int target, int index) {
        //因为题目中说了所有给出的数都是正数，所以说如果遇到target小于0可以直接return
        if(target < 0) {
            return;
        }
        //target等于0这一步自然不用多说，直接作为有效解加入最终解集
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
            helper(candidates, res, temp, target, i);
            target += candidates[i];
            temp.remove(temp.size() - 1);
        }
    }
}