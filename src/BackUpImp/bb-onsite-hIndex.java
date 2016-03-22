public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++) {
            int numPaper = citations.length - i;
            int numCitation = citations[i];
            if(numCitation >= numPaper) {
                return numPaper;
            }
        }
        return 0;
    }
}

//利用后缀和
public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }
        int length = citations.length;
        int[] count = new int[length + 1];
        for(int i = 0; i < length; i++) {
            if(citations[i] >= length) {
                count[length]++;
            }
            else {
                count[citations[i]]++;
            }
        }
        for(int i = length - 1; i >= 0; i--) {
            count[i] += count[i + 1];
        }
        for(int i = length; i >= 0; i--) {
            if(count[i] >= i) {
                return i;
            }
        }
        return 0;
    }
}