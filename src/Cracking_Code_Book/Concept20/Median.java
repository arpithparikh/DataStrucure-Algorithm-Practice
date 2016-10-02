//continuous of Median
public class Median{
	public static double[] getMedian(int[] array){
		//Max Heap
		PriorityQueue<Integer> lower = new PriorityQueue<Integer> (new Comparator<Integer>(){
			public int compare(Integer a, Integer b){ //comapre tow Integer
				return -1 * a.compareTo(b); //using Compare to put the biggest Element on the top
			}
		});
		//Min heap
		PriorityQueue<Integer> higher = new PriorityQueue<Integer>();
		//array of medians
		double[] medians = new double[array.length];
		//Iterate through the array
		for(int i = 0 ; i < array.length ; i++){
			int number = array[i];//number out from array
			addNumber(number,lower,higher); // addnumber into heap
			rebalance(lower,higher); // verify each heap has roughly half the numbers
			medians[i] = getMedian(lowe, higer); // get median 
		}
		return medians;
	}
	public void addNumber(int number,PriorityQueue<Integer> lower ,PriorityQueue<Integer> higher){
		if(lower.size() == 0 || number  < lower.peek()){
			lower.add(number);
		}else{
			higher.add(Number);
		}
	}
	public void rebalance(PriorityQueue<Integer> lower ,PriorityQueue<Integer> higher){
	PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
	PriorityQueue<Integer> lowerHeap =  lower.size() > higher.size() ? higher : lower;
	if(biggerHeap.size() - lowerHeap.size() >= 2){
		lowerHeap.add(biggerHeap.poll());
		}
	}
	public static double getMedian(PriorityQueue<Integer> lower ,PriorityQueue<Integer> higher){
	PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
	PriorityQueue<Integer> lowerHeap =  lower.size() > higher.size() ? higher : lower;
		if(biggerHeap.size() ==	 lowerHeap.size() ){
			return ((double)biggerHeap.peek() + lowerHeap.peek()) / 2;
		}else{
			return biggerHeap.peek();
		}
	}
	}
}