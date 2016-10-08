//Heap Data Structure 
public class MinHeap{

		
		private int capacity = 10;
		private int size = 0;

		int[] items = new int[capacity];

		private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1;}
		private int getRightChildIndex(int parentIndex){ return 2 * parentIndex + 2;}
		private int getParentIndex{int childIndex}     { return (childIndex - 1)/ 2;}

		private boolean hasLeftChild(int index)  {return getLeftChildIndex(index) < size;}
		private boolean hasRightChild(int index) {return getRightChildIndex(index) < size;}
		private boolean hasParent(int index)	 {return getParentIndex(index) >= 0; }

		private int leftChild(int index)	{ return items[getLeftChildIndex(index)];  }
		private int	rightChild(int index)	{ return items[getRightChildIndex(index)]; }
		private int parent(int index)		{ return items[getParentIndex(index)];     }

		//extra methods to support, construct
		private void swap(int indexOne, int indexTwo){
			int temp = items[indexOne];
			items[indexOne] = items[indexTwo];
			items[indexTwo] = temp;
		} 

		//Ensure the Extra Capacity
		private void ensureExtraCapacity(){
			if(size == capacity){
				items = Arrays.copyOf(items,capacity * 2);
				capacity *= 2;
			}

		}
		//upper element
		public int peek(){

			if(size == 0) throw new IllegalStateException();
			return items[0];

		}

		public int poll(){

			if(size == 0) throw new IllegalStateException();
			int item  = items[0];
			items[0] = items[size - 1];
			size -- ;
			heapifyDown();
			return item;
		}

		public void add(int item){

			ensureExtraCapacity();
			items[size] = item;
			size++;
			heapifyUp(); 
		}

		public void heapifyDown(){



		}
		public void heapifyUp(){

			int index =  size - 1;
			while(hasParent(index) && parent(index) > items[index]){
				swap(getParentIndex(Index),index);
				index  = getParentIndex(index);
			}
		}

		public void heapifyDown(){

			int index = 0;
			while(hasLeftChild(index)){

				int smallerChildIndex = getChildIndex(index);
				if(hasRightChild(index) && rightChild(index) < lefChild(index)){
					smallerChildIndex = getRightChildIndex(index);
				}

				if(items[index] < items[smallerChildIndex]){
					break;
				}else{
					swap(index, smallerChildIndex);
				}
				index = smallerChildIndex;
			}
		}

}