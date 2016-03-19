package DataStructure.LinkedLists;

class ListNode {
	//Value
	int val;
	//ListNode next
	ListNode next;
	
	ListNode(int x){
		val = x;
	}
}


public class FindKthLastElement {
	
	public static int Sol(ListNode head,int k)
	{
		//Pre Condition
		if(head==null||k<0)
		{
			return -1;
		}
		
		//L1
		ListNode L1=head;
		//L2
		ListNode L2=head;
		
		//loop over till the kth element
		for(int i=0;i<k-1;i++)//If you find reciprocal k-th, then that k-1, if you want to find a penultimate k + 1, then it is k
		{
			L1=L1.next;
		}
		
		//if its not null then 
		while(L1.next!=null)
		{
			//
			L2=L2.next;
			
			//
			L1=L1.next;
		}
		return L2.val;
	}
	

}
