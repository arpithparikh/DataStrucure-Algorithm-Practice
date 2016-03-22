
class MedianFinder {
	Comp cmp = new Comp();
	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(cmp);
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    public void addNum(int num) {
        minHeap.add(num);
        maxHeap.add(minHeap.poll());
        if(maxHeap.size() > minHeap.size()) {
        	minHeap.offer(maxHeap.poll());
        }
    }

    
    public double findMedian() {
        if(minHeap.size() == maxHeap.size()) {
        	return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
        else {
        	return minHeap.peek();
        }
    }
    private class Comp implements Comparator<Integer> {
    	public int compare(Integer o1, Integer o2) {
    		return o2 - o1;
    	}
    }
};
