//Simple sort :) O(n^2)

public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        // Write your code here
        
        
        
        for(int i = 0; i < A.length; i++){
            
            for(int j = i+1;j<A.length;j++){
                
                if(A[i] > A[j]){
                    
                    int temp = A[i];
                    A[i] = A[j];
                    A[j]= temp;
                }
            }
        }
        
        
    }
}