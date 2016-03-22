


public class HashTable_Sample_1 {
      public static class myMap<K, V> {
            private static int initialCapacity = 64;
            // Math.pow(x, n) x的n次幂
            // 0.6 or 0.75
            /*
            private double DEFAULT_LOAD_FACTOR = (Math.pow(5, 0.5) - 1) / 2;
            */
            // private double DEFAULT_LOAD_FACTOR = 0.75;
            
            private int capacity;
            
            private Node<K, V>[] buckets;
            
            public myMap() {
                  this(initialCapacity);
            }
            
            public myMap(int capacity) {
                  if (capacity <= 0) {
                        throw new IllegalArgumentException("illegal input");
                  }
                  /*
                  int tmp = 1;
                  // tmp * 2^2
                  while (tmp < capacity) {
                        tmp <<= 2;
                  }
                  this.capacity = tmp;
                  */
                  this.capacity = capacity;
                  buckets = new Node[this.capacity];
            }
            
            public class Node<K, V> {
                  private final K key;
                  private V value;
                  private Node<K, V> next;
                  
                  public Node(K key, V value) {
                        this.key = key;
                        this.value = value;
                  }
                  
                  public void setNext(Node<K, V> next) {
                        this.next = next;
                  }
            }
            
            public void put(K key, V value) {
                  if (key == null) {
                        throw new IllegalArgumentException("key can not be null");
                  }
                  
                  int position = index(key);
                  
                  Node<K, V> node = buckets[position];
                  
                  while (node != null) {
                        if (node.key.equals(key)) {
                              node.value = value;
                              return;
                        }
                        node = node.next;
                  }
                  
                  Node<K, V> newNode = new Node<K, V>(key, value);
                  if (buckets[position] != null) {
                        newNode.setNext(buckets[position]);
                  }
                  
                  buckets[position] = newNode;
            }
            
            public V get(K key) {
                  if (key == null) {
                        throw new IllegalArgumentException("key can not be null");
                  }
                  
                  int position = index(key);
                  Node<K, V> node = buckets[position];
                  
                  while (node != null) {
                        if (node.key.equals(key)) {
                              return node.value;
                        }
                        node = node.next;
                  }
                  
                  return null;
            }
            // hash(key)%size
            private int index(K key) {
                  
                  int hashCode = key.hashCode();
                  /*
                  double tmp = hashCode * DEFAULT_LOAD_FACTOR;
                  double digit = tmp - Math.floor(tmp);
                  // The method floor gives the largest integer that is less than or equal to the argument.
                  return (int)Math.floor(digit * capacity);
                  */
                  int index = (hashCode % capacity + capacity) % capacity;
                  return index;
            }
      }
      
      public static void main(String[] args) {
            myMap<String, String> map1 = new myMap<String, String>();
            map1.put("school", "umass");
            map1.put("school", "whut");
            map1.put("job", "sde");
            map1.put("employer", "Linkedin");
            myMap<Integer, String> map2 = new myMap<Integer, String>();
            map2.put(-12, "wuhan");
            map2.put(-13, "hankow");
            System.out.print(map1.get("school") + "\n");
            System.out.print(map1.get("job") + "\n");
            System.out.print(map2.get(-13) + "\n");
      } 
}


package test;
public class HashTable {
    Item[] hashArray;
    int arraySize;//定义数组长度
    public HashTable(int size){//构造器，初始化
        arraySize = size;
        hashArray = new Item[arraySize];
    }
    //哈希函数
    public int hash(int key){
        return key % arraySize;
    }
    //插入，这里假设是数组未满，即不能插入大于arraySize的数据数
    public void insert(Item item){
        int key = item.getKey();
        int hashCode = hash(key);
        //若已存在同样的数据，则向下进一位，直到找到空的位置
        //为了简单，也可要求不准有重复数据
        while(hashArray[hashCode] != null){
            ++hashCode;
            hashCode %= arraySize;
        }
        hashArray[hashCode] = item;
    }
    //删除
    public Item delete(int key){
        int hashCode = hash(key);
        while(hashArray[hashCode] != null){
            if(hashArray[hashCode].getKey() == key){
                Item temp = hashArray[hashCode];
                hashArray[hashCode] = null;
                return temp;
            }
            ++hashCode;
            hashCode %= arraySize;
        }
        return null;
    }
    //查找
    public Item find(int key){
        int hashCode = hash(key);
        while(hashArray[hashCode] != null){
            if(hashArray[hashCode].getKey() == key)
                return hashArray[hashCode];
            ++hashCode;
            hashCode %= arraySize;
        }
        return null;
    }
    //列出全部数据
    public void show(){
        for(int i=0;i<arraySize;i++){
            if(hashArray[i] != null)
                System.out.print(hashArray[i].getKey() + " ");
            else
                System.out.print("* ");
        }
    }
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.insert(new Item(1));
        ht.insert(new Item(2));
        ht.insert(new Item(3));
        ht.insert(new Item(4));
        ht.insert(new Item(4));
        ht.show();
        Item i = ht.find(3);
        System.out.println("i = "+i.getKey());
        Item di = ht.delete(3);
        System.out.println("di = "+di.getKey());
        ht.show();
    }
}
//定义哈希表中存放的数据类型，可以为任意的类型
class Item{
    int idata;
    public Item(int idata){
        this.idata = idata;
    }
    public int getKey(){
        return idata;
    }
}