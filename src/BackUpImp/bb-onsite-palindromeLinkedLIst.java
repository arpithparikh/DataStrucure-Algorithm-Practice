On, On
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while(temp != null) {
        	stack.push(temp);
        	temp = temp.next;
        }
        while(!stack.isEmpty()) {
        	ListNode temp1 = stack.pop();
        	//记住这里要用到val去判断，因为直接用ListNode去判断的话，就算两个ListNode值相同，但还是算作两个不一样的ListNode
        	if(temp1.val != head.val) {
        		return false;
        	}
        	head = head.next;
        }
        return true;
    }
}

On O1
public class Solution {
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) {
			return true;
		}
		ListNode mid = findMid(head);
		ListNode newHead = doReverse(mid.next);
		mid.next = null;
		while(head != null && newHead != null) {
			if(head.val != newHead.val) {
				return false;
			}
			head = head.next;
			newHead = newHead.next;
		}
		return true;
	}
	private ListNode findMid(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	private ListNode doReverse(ListNode head) {
		ListNode prev = null;
		while(head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
}