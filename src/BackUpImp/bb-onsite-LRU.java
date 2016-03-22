class DoubleLinkedListNode {
    int key;
    int val;
    DoubleLinkedListNode pre;
    DoubleLinkedListNode next;
    DoubleLinkedListNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.pre = null;
        this.next = null;
    }
}
public class LRUCache {
    HashMap<Integer, DoubleLinkedListNode> map = new HashMap<Integer, DoubleLinkedListNode>();
    DoubleLinkedListNode head;
    DoubleLinkedListNode end;
    int capacity;
    int length;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        length = 0;
        head = null;
        end = null;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            DoubleLinkedListNode node = map.get(key);
            removeNode(node);
            setHead(node);
            return node.val;
        }
        else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)) {
            DoubleLinkedListNode node = map.get(key);
            removeNode(node);
            node.val = value;
            map.put(key, node);
            setHead(node);
        }
        else {
            if(length < capacity) {
                length++;
                DoubleLinkedListNode node = new DoubleLinkedListNode(key, value);
                setHead(node);
                map.put(key, node);
            }
            else {
                DoubleLinkedListNode node = new DoubleLinkedListNode(key, value);
                //这一步非常之重要
                map.remove(end.key);
                end = end.pre;
                if(end != null) {
                    end.next = null;
                } 
                setHead(node);
                map.put(key, node);
            }
        }
    }
    private void setHead(DoubleLinkedListNode node) {
        node.next = head;
        node.pre = null;
        if(head != null) {
            head.pre = node;
        }
        head = node;
        if(end == null) {
            end = node;
        }
    }
    private void removeNode(DoubleLinkedListNode node) {
        DoubleLinkedListNode cur = node;
        DoubleLinkedListNode pre = node.pre;
        DoubleLinkedListNode next = node.next;
        if(pre != null) {
            pre.next = next;
        }
        else {
            head = next;
        }
        if(next != null) {
            next.pre = pre;
        }
        else {
            end = pre;
        }
    }
}