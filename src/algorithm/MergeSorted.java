class Element {
	int row;
	int col;
	int val;
	Element(int a,int b,int c){
		row = a;
		col = b;
		val = c;
	}
}
public class Solution{
	public List<Integer> mergekSortedArray(int[][] arrys){
		List<Integer> res = new ArrayList<Integer>();
		if(arrays == null||arrays.length == 0){
			return res;
		}

		Comperator<Element> elementComperator =  new Comperator<Element>(){
			public int compare(Element a, Element b){
				return a.val - b.val;
			}
		};

		PriorityQueue<Element> queue = new PriorityQueue<Element>(arrays.length,elementComparator);

		for(int i = 0; i < arrays.length; i++){
			queue.offer(new Element(i,0,arrays[i][0]));
		}

		while(!queue.isEmpty()){

			Element crt = queue.poll();
			res.add(crt.val);
			if(crt.col + 1 < arrays[crt.row].length){
				queue.offer(new e)
			}


		}
	}
}