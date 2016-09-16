//Course Schedule
//There are total of n courses you have to take,labeled from  0 to n-1
//pair [0,1]
//give 2 and [[1,0]], there are a total of 2 courses to take .
// To take course 1 you should have finished course 0.So its possible.
//Given 2 and [[1,0],[0,1]] , there are 2 courses to take. 
//To take course 1 you should have finished course 0. 
//To take course 0 you should have finished course 1.
//So its impossibe 
//To verify that a graph contains the cycle. 
//BFS or DFS.
//Lets Solve using BFS -> Breath first Search 
public class BFS_Solution{ //It's an BFS Solution
	//canFinish the courses or not!
	public boolean canFinish(int numCourses, int[][] prerequisites){
		//if the prerequisites is the null then its illegal prerequisites array
		if(prerequisites == null){
			throw new IllegalArgumentException("illegal prerequisites array");
		}
		int len =  prerequisites.length; //length of the preRequisites
		if(numCourses == 0 || len  == 0){ // numcourses 
			return true; // true;
		}
		//counter for the Number of prerequisites.
		int[] pCounter = new int[numCourses]; // pCounter 
		for(int i = 0; i < len ; i++){
			pCounter[prerequisites[i][0]]++; // pCounter[prerequisites[i][0]]
		}

		//Store courses that have no prerequisites.
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i < numcourses ; i++){
			if(pCounter[i] == 0){
				queue.add(i);
			}
		}

	}
	//numNoPre , queue size
	int numNoPre =  queue.size();
	// if the queue is not empty 
	while(!queue.isEmpty()){
		//removing the last of the queue
		int top = queue.remove();
		for(int i = 0; i < len ; i++){
			if(prerequisites[i][1] == top){
				pCounter[prerequisites[i][0]]--;
				if(pCounter[prerequisites[i][0]] == 0){
					numNoPre++;
					queue.add(prerequisites[i][0]);
				}
			}
		}
	}
	return numNoPre == numCourses;

}