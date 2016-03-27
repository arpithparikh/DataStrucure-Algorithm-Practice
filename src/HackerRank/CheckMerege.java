package HackerRank;


/*Insert Node at the end of a linked list 
head pointer input could be NULL as well for empty list
Node is defined as */
class Node {
   int data;
   Node next;
}


public class CheckMerege {

	
	
	int FindMergeNode(Node headA, Node headB) {
    //Two Pointers
    //Current A and B
    Node currentA = headA;
    Node currentB = headB;

    //Do till the two nodes are the same
    while(currentA != currentB){
        //If you reached the end of one list start at the beginning of the other one
        //currentA
        if(currentA.next == null){
            currentA = headB;
        }else{
            currentA = currentA.next;
        }
        //currentB
        if(currentB.next == null){
            currentB = headA;
        }else{
            currentB = currentB.next;
        }
    }
    return currentB.data;

	
	}
}
