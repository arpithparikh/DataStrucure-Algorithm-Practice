package DataStructure.TreeGraph;

//Redoing necessary

//Each Node is smaller than its children
//Two operation ->Insert and extract_min
//data contain in the each node will be greater than its children 
//Ascending oder the whole tree is represented.
//Insert operation
//Add element at the bottom leaf of the heap

//
//Delete Operation
//Extract_Min Operation.

public class MinHeapImpl {
	
	//min Heap Implementation
	//size of the array
	public int size;
	//array to store the data
	public int [] newHeap;
	//check the position
	public int position;
	
	//constructor contains the parameter size
	public MinHeapImpl(int size)
	{
		this.size=size;
		newHeap=new int[size+1];
		position=0;
	}
	
	//create the Heap
	public void creatHeap(int [] arrayA)
	{
		if(arrayA.length>0)
			for(int i=0;i<arrayA.length;i++)
				insert(arrayA[i]);
	}

	//Insert the element
	private void insert(int x) {
		// TODO Auto-generated method stub
		
		//Position is zero
		if(position==0)
		{
			newHeap[position+1]=x;//position+1
			position=2;
		}
		else
		{
			newHeap[position++]=x;
			bubbleUp();
		}
		
	}

	//Perform the bubble-up operation
	//->if the inserted element is smaller than the parent then swap with root
	private void bubbleUp() {
		// TODO Auto-generated method stub
		
		int pos=position-1;
		while(pos>0 && newHeap[pos/2]>newHeap[pos])
		{
			int temp=newHeap[pos];
			newHeap[pos]=newHeap[pos/2];
			newHeap[pos/2]=temp;
			pos=pos/2;
			
		}
		
	}
	
	public int extractMin(){
		int min = newHeap[1];
		newHeap[1]=newHeap[position-1];
		newHeap[position-1]=0;
		position--;		
		sinkDown(1);
		return min;
	}
	

	public void sinkDown(int k){int a = newHeap[k];
	int smallest =k;
	if(2*k<position && newHeap[smallest]>newHeap[2*k]){
		smallest = 2*k;
	}
	if(2*k+1<position && newHeap[smallest]>newHeap[2*k+1]){
		smallest = 2*k+1;
	}
	if(smallest!=k){
		swap(k,smallest);
		sinkDown(smallest);
	}
			
}
public void swap(int a, int b){
	//swap
	int temp =newHeap[a];
	newHeap[a] = newHeap[b];
	newHeap[b] = temp;
}
	
public void display(){
	for(int i=1;i<newHeap.length;i++){
		System.out.print(" " + newHeap[i]);			
	}
	System.out.println("");
}

public static void main(String args[]){
	int arrA [] = {3,2,1,7,8,4,10,16,12};
	System.out.print("Original Array : ");
	for(int i=0;i<arrA.length;i++){
		System.out.print("  " + arrA[i]);
	}
	MinHeapImpl m = new MinHeapImpl(arrA.length);
	System.out.print("\nMin-Heap : ");
	m.creatHeap(arrA);		
	m.display();
	System.out.print("Extract Min :");
	for(int i=0;i<arrA.length;i++){
		System.out.print("  " + m.extractMin());
	}
}
}
