数字游戏 给一个list, list中有两个数. 
过程中可以一直往list中加数进去(append在最后), 
但必须一直遵守三个条件: 
1. list中所有数均需大于0 
2. list中所有数都必须为unique 
3. 新加入的数必须为已存在list中的某两数的差

要做的事情是把所有可能的过程(一直加到没办法加入新的数字为止)都给打印或是回传

ex. [30, 5], 则最新加入的数只能为25, list变为[30, 5, 25] 继续, 
只能再加入20, list成为[30, 5, 25, 20], 接着就有两种选择,
可以加10(30-20) 或是15(20-5). 于是会分出两个branch [30, 5, 25, 20, 10] 跟[30, 5, 25, 20, 15], 
然后再把最后一个可能补上之后变成 [30, 5, 25, 20, 10, 15]跟[30, 5, 25, 20, 15, 10]

import java.util.*;
public class add {

public static ArrayList<ArrayList<Integer>> genNums(int num1, int num2) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(num1);
        result.add(num2);
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        queue.offer(result);
        genNumsHelper(results, queue);
        return results;
    }

    public static void genNumsHelper(ArrayList<ArrayList<Integer>> results, Queue<ArrayList<Integer>> queue) {
        while(queue.size() > 0) {
            boolean find = false;
            ArrayList<Integer> result = queue.poll();
            int size = result.size();
            Set<Integer> set = new HashSet<>(result);
            for (int i = 0; i < size - 1; i++) {
                int diff = Math.abs(result.get(i) - result.get(size - 1));
                if (set.contains(diff)) {
                    continue;
                } else {
                    find = true;
                }
                set.add(diff);
                result.add(diff);
                queue.offer(new ArrayList<Integer>(result));
                for(Integer item : result) {
                	System.out.print(item + " ");
                }
                System.out.println(" ");
                result.remove(result.size() - 1);
            }
            if (!find) results.add(new ArrayList<Integer>(result));
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> results = genNums(30, 5);
    }
 }

30 5 25  
30 5 25 20  
30 5 25 20 10  
30 5 25 20 15  
30 5 25 20 10 15  
30 5 25 20 15 10  


