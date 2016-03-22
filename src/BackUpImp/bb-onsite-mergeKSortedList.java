时间Onlogn，空间O1
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        return helper(lists, 0, lists.length - 1);
    }
    private ListNode helper(ListNode[] lists, int start, int end) {
        if(start == end) {
            return lists[start];
        }
        int mid = start + (end - start) / 2;
        ListNode left = helper(lists, start, mid);
        ListNode right = helper(lists, mid + 1, end);
        return mergeTwo(left, right);
    }
    private ListNode mergeTwo(ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(head1 != null && head2 != null) {
            if(head1.val > head2.val) {
                head.next = head2;
                head = head.next;
                head2 = head2.next;
            }
            else {
                head.next = head1;
                head = head.next;
                head1 = head1.next;
            }
        }
        if(head1 != null) {
            head.next = head1;
        }
        if(head2 != null) {
            head.next = head2;
        }
        return dummy.next;
    }
}
时间Onlogn，空间On
public class Solution {
    private class Comp implements Comparator<ListNode> {
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        Comp cmp = new Comp();
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length, cmp);
        for(ListNode node : lists) {
            if(node != null) {
                minHeap.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(!minHeap.isEmpty()) {
            ListNode temp = minHeap.poll();
            head.next = temp;
            head = head.next;
            if(temp.next != null) {
                minHeap.offer(temp.next);
            }
        }
        return dummy.next;
    }
}
