
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
       ListNode dummy = new ListNode(0);
    ListNode p = dummy;
 
    while(l1!=null||l2!=null){
        if(l1!=null&&l2!=null){
            if(l1.val < l2.val){
                p.next = l1;
                l1=l1.next;
            }else{
                p.next=l2;
                l2=l2.next;
            }
            p = p.next;
        }else if(l1==null){
            p.next = l2;
            break;
        }else if(l2==null){
            p.next = l1;
            break;
        }
    }
 
    return dummy.next;
        
    }
}