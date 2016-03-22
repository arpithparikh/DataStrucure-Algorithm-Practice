第一种方法是使用hashmap来做，key存原始的pointer，value存新的pointer
第一遍，先不copy ranodm的值，只copy数值建立好新的链表，并把新旧pointer存在hashmap中
第二遍，遍历旧表，复制random的值，因为第一遍已经把链表复制好了并且也存在hashmap中了，所以只需从
hashmap中，把当前旧的node.random作为key值，得到新的value值，并把其赋给新的node.random就好
时间On，空间On

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) {
            return null;
        }
        RandomListNode dummy1 = head;
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode dummy2 = newHead;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        map.put(dummy1, dummy2);
        dummy1 = head.next;
        while(dummy1 != null) {
            RandomListNode temp = new RandomListNode(dummy1.label);
            dummy2.next = temp;
            map.put(dummy1, temp);
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;
        }
        dummy1 = head;
        dummy2 = newHead;
        while(dummy1 != null) {
            dummy2.random = map.get(dummy1.random);
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;
        }
        return newHead;
    }
}


下面一种方法不需要额外存储空间，但是需要遍历三次，所以时间是On，空间是O1
第一遍，对每个node进行复制，并插入其原始node的后面，新旧交替，变成重复链表。
如：原始：1->2->3->null，复制后：1->1->2->2->3->3->null
第二遍，遍历每个旧node，把旧node的random的复制给新node的random，因为链表已经是新旧交替的。所以复制方法为：

node.next.random = node.random.next
第三遍，则是把新旧两个表拆开，返回新的表即可
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) {
            return null;
        }
        RandomListNode temp = head;
        while(temp != null) {
            RandomListNode node = new RandomListNode(temp.label);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        temp = head;
        while(temp != null) {
            if(temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        RandomListNode newHead = head.next;
        temp = head;
        while(temp != null) {
            RandomListNode node = temp.next;
            temp.next = node.next;
            if(node.next != null) {
                node.next = node.next.next;
            }
            temp = temp.next;
        }
        return newHead;
    }
}