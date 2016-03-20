//To check, there is a rout between two nodes.
//Graph Traversal to solve this problem , such as DFS/BFS. 

package DataStructure.TreeGraph;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//Node class with the set of neighbors// 
class Node{
	
	public int val;
	public Set<Node> neighbors;
	Node(int v)
	{
		val=v;
		neighbors=new HashSet<Node>();
	}
}
//Time complexity: O (n), the average for each node into the team the team number is 1, the operation of all nodes in the average complexity of O (n)
//Space complexity: O (n), we use a HashSet to store already visited nodes, as well as the queue queue space.
public class AreConnected {
	
	public static boolean areConnected(Node src,Node dest)
	{
		//HashSet visited Node
		HashSet<Node> visited=new HashSet<Node>();
		
		//Empty List 
		Queue<Node> queue=new LinkedList<Node>();
		
		//to insert the node
		queue.offer(src);
		
		//size is not zero
		while(queue.size()!=0)
		{
			//size of the overall queue
			int size=queue.size();
			
			for(int i=0;i<size;i++)
			{
				Node temp=queue.poll();
				
				visited.add(temp);
				
				//Temporary contains destination node then it will return true.
				if(temp.neighbors.contains(dest))
				{
					return true;
					
				}
				
				//Iterate over the neighbors.
				Iterator<Node> iterator=temp.neighbors.iterator();
				
				//
				while(iterator.hasNext())
				{
					
					Node child =iterator.next();
					//check it visited or not
					if(visited.contains(child))
					{
						continue;
					}
					queue.offer(child);
				}
			}
			
		}
		
		return false;
	}
	
	public static void main(String[] args) {	
	
		//Todo
/*		
		Node n1 = new Node(0);
		Node n2 = new Node(1);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
 
		n1.neighbors.add(n2);
		n1.neighbors.add(n3);
		n2.neighbors.add(n4);
		n4.neighbors.add(n5);
		n4.neighbors.add(n1);
		n3.neighbors.add(n5);
		n3.neighbors.add(n3);
 
		System.out.println(!areConnected(n1, n6));
		System.out.println(areConnected(n1, n5));
		System.out.println(!areConnected(n5, n1));	
		System.out.println(areConnected(n1, n2));
		System.out.println(areConnected(n1, n3));
		System.out.println(areConnected(n1, n4));
		System.out.println(areConnected(n4, n1));
		System.out.println(areConnected(n3, n1));
		System.out.println(!areConnected(n5, n6));
		System.out.println(areConnected(n3, n3));*/	
	}
	

}
