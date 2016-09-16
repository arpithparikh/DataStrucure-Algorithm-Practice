//GraphNode         // Simple BFS in the graph 
class GraphNode{
	int val;
	GraphNode next;
	GraphNode[] neightbors;
	boolean visited;

	GraphNode(int x){
		val = x;
	}
	GraphNode(int x,GraphNode[] n){
		val  = x;
		neightbors = n;
	}
	public String toString(){
		return "value"+ this.val;
	}
}
//Define Queue
class Queue{
		GraphNode first, last;
		//Insert the node in queue
		public void enqueue(GraphNode n){
			if(first == null){
				first = n;
				last  = first;
			}else{
				last.next = n;
				last = n;
			}
		}

		//delete the node from the Queue
		public GraphNode dequeue(){
			if(first  == null){
				return null;
			}else{
				//Temperory GraphNode => 
				GraphNode temp = new GraphNode(first.val,first.neightbors);
				first = fist.next;
				return temp;
			}
		}
}
//BFS 
public static void bfs(GraphNode root, int x){	
	if(root.val  == x){
			System.out.print("find in root"); 
	}
	//Queue 
	Queue queue = new Queue(); //Creating the Queue
	root.visited = true; // root.visited  = true .
	queue.enqueue(root); // inserting the root node in the queue.
	//Queue
	while(queue.first != null){ // check that the queue.fist  == null
		GraphNode c = (GraphNode) queue.dequeue(); //deleting the graphnode
		for(GraphNode n : c.neighbors){  // loop through the neighbours of the selected node 
			if(!n.visited){
				System.out.print(n + " ");
				n.visited = true;
				if(n.val == x){
					System.out.println("Find"+n);
					queue.enqueue(n);
				}
			}
		}
	}

}