package HackerRank;

public class RemoveDupsFromLinkedList {
	
	
	
	
	Node RemoveDuplicates(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
		    

		    //Taking the HashTable

		  if ( head == null )
		      return null;
		    
		    //For the Next item
		  Node nextItem = head.next;
		    
		    //if the nextItem is not null
		  while ( nextItem != null && head.data == nextItem.data ) {
		    nextItem = nextItem.next;
		  }
		  head.next = RemoveDuplicates( nextItem );
		  return head;


		}

}
