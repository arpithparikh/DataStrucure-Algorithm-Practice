
package HackerRank;


//Floyd's Algorithm to Detect the Cycle
//The algorithm thus maintains two pointers into the given sequence, one (the tortoise) at xi, and the other (the hare) at x2i. At each step of the algorithm, it increases i by one, moving the tortoise one step forward and the hare two steps forward in the sequence, and then compares the sequence values at these two pointers. The smallest value of i > 0 for which the tortoise and hare point to equal values is the desired value ν.
public class HasCycle {
	
/*
	  Detect cycle in the list
	  head pointer input could be NULL as well for empty list
	  Node is defined as */
	  class Node {
	     int data;
	     Node next;
	  }
	
	int HasCycle(Node head) {
	    
	    
	    if(head == null || head.next == null) return 0;

	    Node hare = head;
	    Node tortoise = head;

	    //hare is not null and hare next and next is not null
	    while(hare.next != null && hare.next.next != null) {
	        
	        //hare just two steps 
	        hare = hare.next.next;
	        //tortoise jump one step
	        tortoise = tortoise.next;
	        //so if hare and tortoise are same then there is the cycle
	        if(hare == tortoise) return 1;
	    }
	    return 0;

	    
	    

	}


}
