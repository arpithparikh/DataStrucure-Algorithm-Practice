package Cracking_Code_Book.CH4;

import java.lang.Thread.State;
import java.util.LinkedList;
import java.util.Queue;

//Design Algorithm to figure out if there is route between the two Nodes


//@author:@rpit
class Graph
{
	public Node[] node;

	public Node[] getNode() {
		return node;
	}

	public void setNode(Node[] node) {
		this.node = node;
	}
	
	}

class Node
{

	private String name;
	private Node[] children ;
//	public State state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node[] getChildren() {
		return children;
	}
	public void setChildren(Node[] children) {
		this.children = children;
	}
}


//Time complexity in worst case O(n+m) where n->all the nodes, m->all the edges
public class RouteBetweenNodes {
	
	//1.USE BFS
	//2.Search the first NODE->precondition
	//3.Search the Second Node->precondition
	//4.Traverse from Second to First until visit the First and keep updating the Nodes which which has been the visited during the visit.
	//
	
	/*//define the state
	enum State{Unvisited,Visited,Visiting}
	
	boolean search(Graph g,Node start , Node end)
	{
		
		//to check start and End node is Available or not in the graph 
		
		//we are USING BFS/DFS
		
		if(start==end)
			return true;
		
		LinkedList<Node> q=new LinkedList<Node>();
		
		for(Node u:g.getNode())
		{
			u.state=State.Unvisited;//get All Unvisited Nodes
			
		}
		
		start.state=State.Visiting;//Start Visiting
		
		q.add(start);//add the Starting Node
		
		while(!q.isEmpty())
		{
			u=q.removeFirst();//i.e, dequeue();
		}
		
		for(Node v:u.getAdjacent())
		{
			if(v.state==State.Unvisited)
				if(v==end)
					return true;
				else
					v.state=State.Visiting;
					q.add(v);
		}
		
		u.state=State.Visited;
		
		
	}
	*/
	
	//Actual Implementation
	
	

	
	

}
