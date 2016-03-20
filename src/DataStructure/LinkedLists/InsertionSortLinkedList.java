//Create an empty sorted (or result) list.
//Traverse the given list. 
//a) Insert current node in sorted way in sorted or result list.
//change the head of given linked list to head of sorted list.
//Example:   [5,3,8,1,6]


//Using the Java collection API LinkedList using same logic of Basic Insertion Sort.
package DataStructure.LinkedLists;

public class InsertionSortLinkedList {
	
	// Mysort using LinkedList
	public static java.util.LinkedList<Integer> mySort(java.util.LinkedList<Integer> linkedList)
	{
		//loop over
		for(int i=1;i<linkedList.size();i++)
		{
			//to get-> returns the element specified position in the list.
			int key=linkedList.get(i);
			
			int j=i-1;
			
			while(j>=0 && linkedList.get(j)>key)
			{
				//setting the LinkedList logic => arr[j+1]=arr[j]
				linkedList.set(j+1,linkedList.get(j));
				j--;
			}
			
			linkedList.set(j+1,key);
		}
		
		return linkedList;
		
	}
	
	public static void main(String args[])
	{
		java.util.LinkedList<Integer> linkedList=new java.util.LinkedList<Integer>();
		
		linkedList.add(5);
		linkedList.add(3);
		linkedList.add(8);
		linkedList.add(1);
		linkedList.add(6);
		
		System.out.println(mySort(linkedList));
		
		//Answer: [1, 3, 5, 6, 8]
	}
	
	
	

}
