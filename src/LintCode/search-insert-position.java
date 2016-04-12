c class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0){
            return 0;
        }
        int start = 0;
        int end = A.length - 1;
        while(start + 1 < end){
            int mid = (start + end)/2;
            if(A[mid] == target){
                return mid;
            }
            if(A[mid] > target){
                end = mid;
            }
            if(A[mid] < target){
                start = mid;
            }
        }
        //这里要加等号的
        if(A[start] >= target){
            return start;
        }
        if(A[end] >= target){
            return end;
        }
        return end + 1;
    }
}
