package Algorithms;

public class MaxHeap
{
    private int[] Heap;
    private int size;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }
 
    private int parent(int pos)
    {
        return pos / 2;
    }
 
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
 
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 
    private boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        {
            return true;
        }
        return false;
    }
 
    private void swap(int fpos,int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    private void maxHeapify(int pos)
    {
        if (!isLeaf(pos))
        { 
            if ( Heap[pos] < Heap[leftChild(pos)]  || Heap[pos] < Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] > Heap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }
 
    public void insert(int element)
    {
        Heap[++size] = element;
        int current = size;
 
        while(Heap[current] > Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }	
    }
 
    public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i]
                  + " RIGHT CHILD :" + Heap[2 * i  + 1]);
            System.out.println();
        }
    }
 
    public void maxHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            maxHeapify(pos);
        }
    }
 
    public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--]; 
        maxHeapify(FRONT);
        return popped;
    }
 
    public static void main(String...arg)
    {
    	//[77 | 45 | 2 | 87 | 12 | 5 | 7 | 19 | 98 | 43| 32 | 27], 
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(13);
        maxHeap.insert(107);
        maxHeap.insert(87);
        maxHeap.insert(98);
        maxHeap.insert(77);
        maxHeap.insert(43);
        maxHeap.insert(27);
        maxHeap.insert(5);
        maxHeap.insert(19);
        maxHeap.insert(45);
        maxHeap.insert(12);
        maxHeap.insert(32);
        maxHeap.insert(2);
        maxHeap.insert(7);
        maxHeap.maxHeap();
 
        maxHeap.print();
        System.out.println("The max val is " + maxHeap.remove());
    }
}