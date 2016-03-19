//Remove the Duplicates from the unsorted LinkedList
//O()

package DataStructure.LinkedLists;

/*class ListNode
{
	int val;
	ListNode Next;
	
	ListNode(int x)
	{
		val=x;
		Next=null;
	}
	
	
	}

public class RemoveDuplicates {
	
	static class ListNode {

		int data;
		ListNode next;

		ListNode(int d) {
			data = d;
			next = null;
		}
	}

static ListNode head;
	//Sending the data to LinkedList
	public static ListNode arrayToLinkedList(int[] arr)
	{
		//if the arr=null and length <1
		if(arr==null|| arr.length<1)
			return null;
		
		//Fake head
		ListNode fakeHead=new ListNode(0);
		ListNode curr=fakeHead;
		for(int i=0;i<arr.length;i++)
		{
			curr.Next=new ListNode(arr[i]);
			curr=curr.Next;
		}
		return fakeHead.Next;
	}
	
	
	public static boolean compareLinkedList(ListNode a,ListNode b)
	{
		ListNode P1=a;
		ListNode P2=b;
	
		 Pick elements one by one 
		while(P1!=null && P2!=null)
		{
			if(P1.val!=P2.val)
			{
				return false;
			}
			else
			{
				P1=P1.Next;
				P2=P2.Next;
				
			}
			return P1==null && P2==null;
		}
		return false;
			
	
	}
	
	//Actual with O(N2)
	void remove_duplicate()
	{
		//ListNode N1
		ListNode N1=null;
		
		//ListNode N2
		ListNode N2=null;
		
		//Duplicates initialization
		ListNode duplicates=null;
		
		//Assuming the N1 has head
		N1=head;
		
		//pick elements one by one 
		while(N1!= null && N1.next!=null )
		{
			N2=N1;
			
			//Compare the picked Elements with rest of the elements
			while(N2.next!=null)
			{
				if(N1.data=N2.data.Next)
				{
					
				}
			}
			
		}
	}
}

	*/



//Java program to remove duplicates from unsorted linked list

class LinkedList {

 static Node head;

 static class Node {

     int data;
     Node next;

     Node(int d) {
         data = d;
         next = null;
     }
 }

 /* Function to remove duplicates from a unsorted linked list */
 void remove_duplicates() {
     Node ptr1 = null, ptr2 = null, dup = null;
     ptr1 = head;

     /* Pick elements one by one */
     while (ptr1 != null && ptr1.next != null) {
         ptr2 = ptr1;

         /* Compare the picked element with rest of the elements */
         while (ptr2.next != null) {

             /* If duplicate then delete it */
             if (ptr1.data == ptr2.next.data) {

                 /* sequence of steps is important here */
                 dup = ptr2.next;
                 ptr2.next = ptr2.next.next;
                 System.gc();
             } else /* This is tricky */ {
                 ptr2 = ptr2.next;
             }
         }
         ptr1 = ptr1.next;
     }
 }

}