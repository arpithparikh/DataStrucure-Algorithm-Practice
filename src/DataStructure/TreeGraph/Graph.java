package DataStructure.TreeGraph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


//Two ways to represent the graph adjacency List /Adjacency Matrices
//DFS
//BFS

public class Graph {

	//DFS sudo code
	/*void Search(Node root)
	{
	//root ==null
		if(root==null)
			return;
			//if its visited
		visit(root);
		//if the root visted then update as true
		root.visited=true;
		//for each check whether the n is adjacent 
		foreach(Node n in root.adjacent)
		//if the still some false visit then search(n) it again it follows the recursion
		if(n.visited(n)==false)
		search(n);
	}*/
	
	private int v; // No. of vertices
	
	private LinkedList<Integer> adj[]; //Array of lists for adjacency list representation
	
	//constructor
	Graph(int v)
	{
		v=this.v;
		
		adj=new LinkedList[v];
	
		for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
		
	}
	
	//adding the Edge v-vertices , w-edge
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}

	
	//DFS IMPLEMENTATION 
	void DFS()
	{
		boolean visit[]=new boolean[v];
		
		for (int i=0; i<v; ++i)
            if (visit[i] == false)
            	DFSfunction(v,visit);
    }
 

	private void DFSfunction(int v, boolean[] visited) {
		// TODO Auto-generated method stub
	
		visited[v]=true;
		
		System.out.println(v+"");
	
		//iterate over the vertex
		Iterator<Integer> iterator=adj[v].iterator();
		
		//has next
		while(iterator.hasNext())
		{
			//
			int n=iterator.next();
			
			if(!visited[n])
			{
				DFSfunction(v, visited);
			}
		}

	}
	
	
	//************************************END DFS*****************************************
	
	//************************************Start BFS***************************************
	
	//Its not recursive , it uses queue
		/*void Search(Node node)
	{
		Queue queue;
		root.marked=true;
		queue.enqueue(root); //Add to the end of Queue
		
		while(!queue.isEmpty())
			Node node=queue.dequeue();
		
			visit(r);
			foreach(Node n in r.adjacent)
			if(n.marked==false)
			n.marked=true;
			queue.enqueue(n);
		
		
	}*/

	//BFS Search
	void BFS(int s)
	{
		//mark all the vertices are not visited
		boolean visited[]=new boolean[v];
		
		//Create queue for BFS
		
		//Create the Queue for BFS
		LinkedList<Integer> queue=new LinkedList<Integer>();
		
		//mark the current node as visited
		visited[s]=true;
		
		queue.add(s);
		
		while(queue.size()!=0)
			//dequeue
			s=queue.poll();
		System.out.print(s+"");
		
		//Iterator
		Iterator<Integer> itr=adj[s].listIterator();
		
		while(itr.hasNext())
		{
			int n=itr.next();
			
			if(!visited[n])
				visited[n]=true;
				queue.add(n);
		}
	}
	
	//Bidirectional Search
	//Shortest Path between a source and a destination node.
	// It operates by essentially two simultaneous BFS

}
