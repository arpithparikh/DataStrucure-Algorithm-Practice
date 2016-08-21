//Adding two Numbers , the digits are in the reverse order , need to calculate the 
class AddTwoList{
//Add two Lists
public ListNode addLists(ListNode l1,ListNode l2){
ListNode dummy = new ListNode(0);
ListNode p1 = l1,p2=l2,p3=dummy;
int carry = 0;
while(p1!=null && p2!=null){
if(p1!=null)
carry += p1;
p1 =p1.next;
}
	if(p2!=null){
		carry += p2;
		p2 =p2.next;
	}
	p3 = new ListNode(carry%10);
	p3 = p3.next;
	carry/= 10;
	}
	if(carry == 1){
		p3.next = new ListNode(1);
	}
	return newHead.next;
	}
}

