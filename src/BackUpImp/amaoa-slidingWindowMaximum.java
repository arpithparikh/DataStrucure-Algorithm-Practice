Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

For example,
Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Therefore, return the max sliding window as [3,3,5,5,6,7].

Note: 
You may assume k is always valid, ie: 1 ≤ k ≤ input array size for non-empty array.
//时间On2，空间On
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 2) {
        	return nums;
        }
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for(int i = 0; i < nums.length - k + 1; i++) {
        	int max = Integer.MIN_VALUE;
        	//这里需要pay attention
        	for(int j = i; j < i + k; j++) {
        		max = Math.max(max, nums[j]);
        	}
        	res[index++] = max;
        }
        return res;
    }
}
//时间On，空间On
http://www.tutorialspoint.com/java/util/java_util_arraydeque.htm
利用双端队列deque接口的ArrayDeque类的实现，维护单调递减队列
ArrayDeque provides resizable array and implements Deque interface
deque: getFirst, getLast
       add, addFirst, addLast
       peek, peekFirst, peekLast,
       poll, pollFirst, pollLast,
       remove, removeFirst, removeLast
       toArray();


/*
解析:
	务必记住这一类问题的解决办法。相当于我们借助一个双端口队列deque来完成这个任务。我们知道我们的sliding window每次右边界右移一个元素同时左边界也右移一个元素。
该双端口队列的队首head，始终存放当前size=k的窗口内的max value我们的结果就是来自这个max value.我们scan from 0 to n-1. 
The algorithm is amortized O(n) as each element is put and polled once.
	我们的双端口队列中存放的是原始数组中数的index. 每次来一个新的元素就意味着左边界会丢失一个元素。如果deque的peek值即max value的index已经不再window内，我们就要从deque的
前面开始poll()因为他们不可能在是window内的最大值因为压根就不再window内。
	同时，新来的元素值a[i]我们从tail开始不断往前比，如果他的值比tail的那些值大，if a[x] <a[i] and x<i, then a[x] has no chance to be the "max" in 
[i-(k-1),i], or any other subsequent window: a[i] would always be a better candidate.
	As a result elements in the deque are ordered in both sequence in array and their value. 
At each step the head of the deque is the max element in [i-(k-1),i]
	换句话说，我们的deque就是个单调队列！！！
单调递减队列是这么一个队列，它的头元素一直是队列当中的最大值，而且队列中的值是按照递减的顺序排列的。我们可以从队列的末尾插入一个元素，可以从队列的两端删除元素。
1.首先看插入元素：为了保证队列的递减性，我们在插入元素v的时候，要将队尾的元素和v比较，如果队尾的元素不大于v,则删除队尾的元素，然后继续将新的队尾的元素与v比较，直到队尾的元素大于v,这个时候我们才将v插入到队尾。
2.队尾的删除刚刚已经说了，那么队首的元素什么时候删除呢？由于我们只需要保存i的前k-1个元素中的最大值，所以当队首的元素的索引或下标小于i-k+1的时候，就说明队首的元素对于求f(i)已经没有意义了，因为它已经不在窗里面了。所以当index[队首元素]<i-k+1时，将队首元素删除。< p="">
从上面的介绍当中，我们知道，单调队列与队列唯一的不同就在于它不仅要保存元素的值，而且要保存元素的索引（当然在实际应用中我们可以只需要保存索引，而通过索引间接找到当前索引的值）。
*/
// 时间复杂度: O(n), 每个元素平均入队1次，出队1次，因为均摊时间复杂度为O(1),整个问题平均时间复杂度为O(n)
// 空间复杂度: O(n)

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if( nums == null || nums.length == 0 || k <= 0 ){
        	return null;
        }
        int length = nums.length;
        int[] results = new int[ length - k + 1]; // 一共有这么多个窗口windows的结果。
        int t = 0;
        Deque<Integer> doubleEndedQueue = new ArrayDeque<Integer>();

        for(int i = 0; i < length; i++){

        	while( doubleEndedQueue.size() != 0 && doubleEndedQueue.peek() < i + 1 - k ){
        		doubleEndedQueue.poll(); // 当最大值元素所在的index已经不再窗口内了，则可以直接丢弃了。
        	}

        	while( doubleEndedQueue.size() != 0 && nums[doubleEndedQueue.peekLast()] < nums[i] ){
        		doubleEndedQueue.pollLast(); // 当新的元素来时，为了维持单调队列，要找到其应该插入的位置
        	}
        	doubleEndedQueue.offer(i);
        	if( i + 1 >= k ){ // 当i满足这个条件开始，相当于从第一个window开始了之后的每次最大值的存入
        		results[t++] = nums[doubleEndedQueue.peek()];
        	}
        }
        return results;
    }
}
