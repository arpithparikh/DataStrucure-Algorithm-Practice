//Cloning the Undirected Graph.
//a queue is used to do BFS traversal.
//A Map is used to store the visited nodes. Its the map between original node and copied node.
//Solutions of the Undirected Graph.
public class Solution{
	//Undirected GraphNode which is the CloneGraph.
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
		if(node == null){ //node == null
			return null;
		}
		//LinkedList using the Queue ,undirected Graph in the Queue 
		LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>(); //LinkedList in the Queue and Undirected Graph.
		HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>(); //HashMap in the Undirected Graph	
		UndirectedGraphNode newHead = new UndirectedGraphNode(node.label); // Undirected , node.label
		queue.add(node);//adding the node in the queue
		map.put(node,newHead);		// keeping the key as node, newHard as node.val
		while(!queue.isEmpty()){ //queue.isEmpty()
			UndirectedGraphNode curr = queue.pop(); // deleting the current node from the Queue
			ArrayList<UndirectedGraphNode> currNeightbors = curr.neighbors; // neighbors from the ArrayList
			for(UndirectedGraphNode aNeightbor : currNeighbors){ // loop trough the neightbours 
				if(!map.containsKey(aNeighbor)){ //
						UndirectedGraphNode copy = new UndirectedGraphNode(aNeighbor.label); //copy them
						map.put(aNeighbor,copy); // putting the neighbors 
						map.get(curr).neighbors.add(copy); //
						queue.add(aNeighbor); //add the neighbors
				}else{
						map.get(curr).neighbors.add(map.get(aNeighbor));
				}
			}
		}
		return newHead;
	}
}
