//DFS => Inital code called as Deep into path without asking to any of the children 
//Graph class
public class Graph{
	//HashMap
	private HashMap<Integer,Node> newLookup = new HashMap<Integer,Node>(); //for the adding the node 
	//Node class
	public static class Node{
		private int id; //Node id
		LinkedList<Node> adjacent = new LinkedList<Node>(); //add edge
		private Node(int id){ //Node Constructor  
			this.id = id; //id
		}
	}
	//Getting the Node from the id.
	private Node getNode(int id){ //getNode
	}

	//adding the Edge
	private void addEdge(int source, int destination){ //add the edge in the Node
	}
	//Has Path DFS
	public boolean hasPathDFS(int source, int destination){ //source - > destination
		Node s = getNode(source); // source
		Node d = getNode(destination); //destination
		Set<Integer> visited = new HashSet<Integer>(); //should say HashSet, visited or Integer
		return hasPathDFS(s,d,visited); //hasPathDFS
	}
	private boolean hasPathDFS(Node source , Node destination, HashSet<Integer> visited){
		if(visited.contains(source.id)){  // visited.contains(source.id)
			return false;  //returning the false
		}
		visited.add(source.id); // adding the source of the Id
		if(source == desination){ //
			return true;
		}
		for(Node child : source.adjacent){
			if(hasPathDFS(child,destination,visited)){
				return true;
			}
		}
		return false;
	}

	//Bredth first Search(BFS)
	//hasPathBFS
	//Node and Destination
	//Create LinkedList 
	//Visited 
	//nextToVist.add(source); => Source, destination

	//
	public boolean hasPathBFS(Node source, Node destination){
		//LinkedList in Queue
		LinkedList<Queue> nextToVisit = new LinkedList<Queue>(); 
		//HashSet 
		HashSet<Integer> visited = new HashSet<Integer>(); //visited
		nextTovisit.add(source); //add nextTovisit 
		while(!nextTovisit.isEmpty()){  //check whether isEmpty() or not!
			//nextToVisit
			Node node = nextToVisit.remove(); //if its remove
				//node == destination
				if(node == desintion){ // node == destination
					return true; //returning the true 
				}
				//visited.contains(node.id)
				if(visited.contains(node.id)){ // node.id
					continue; 
				}
				//
				visited.add(node.id); //adding the node.id

				for(Node child : node.adjacent){
					nextToVisit.add(child); //nextToVisit.add(child);
				}
		}
				return false; 
	}
}