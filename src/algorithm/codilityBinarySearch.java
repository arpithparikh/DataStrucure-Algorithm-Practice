// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int K, int M, int[] A) {
        // write your code in Java SE 8
            
            int n = A.length ;
            
            int total = 0, maximum = 0;
            
            for(int i = 0  ; i < n ; i++){
                total +=A[i];
                maximum =Math.max(maximum,A[i]);
            }
            
            int start = maximum , end = total; 
        
        
            while(start < end){

                int mid = (start + end)/2;
                
            int intervals = countIntervals(A,mid);
            
            if(intervals > K)
            start = mid + 1;
            else
            end = mid - 1;
                
                
                }
        
        
        
        return start;
        
    }
    
    private int countIntervals(int[] A, int target) {
        int sum = 0, count = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum > target) {
                count++;
                sum = A[i];
            }
        }
        return count + (sum > 0 ? 1 : 0);
    }
    
    
}