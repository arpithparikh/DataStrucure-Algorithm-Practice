class Solution {
    public int hashCode(char[] key,int HASH_SIZE) {
        if(key == null || key.length == 0) {
            return 0;
        }
        long res = 0;
        for(int i = 0; i < key.length; i++) {
            int weight = (int)key[i];
            res = (res * 33 + weight) % HASH_SIZE;
        }
        return (int)res;
    }
};



public class Solution {
    public ListNode[] rehashing(ListNode[] hashTable) {
        if(hashTable == null || hashTable.length == 0) {
            return hashTable;
        }
        int capacity = hashTable.length;
        int newCap = 2 * capacity;
        ListNode[] res = new ListNode[newCap];
        for(int i = 0; i < capacity; i++) {
            if(hashTable[i] != null) {
                ListNode node = hashTable[i];
                while(node != null) {
                    ListNode next = node.next;
                    node.next = null;
                    setNode(res, node);
                    node = next;
                }
            }
        }
        return res;
    }
    private void setNode(ListNode[] res, ListNode node) {
        int cap = res.length;
        int loc = 0;
        if(node.val >= 0) {
            loc = node.val % cap;
        }
        else {
            loc = (node.val % cap + cap) % cap;
        }
        if(res[loc] == null) {
            res[loc] = node;
        }
        else {
            ListNode temp = res[loc];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
};
