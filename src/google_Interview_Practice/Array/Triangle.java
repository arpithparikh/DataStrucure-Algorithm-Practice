package google_Interview_Practice.Array;
import java.util.ArrayList;
//The Minimum path sum from Top to bottom is (2+3+5+1 = 11)
public class Triangle {
		public int minimumTotal(ArrayList<ArrayList<Integer>> triangle){
		if(triangle == null || triangle.size() == 0){
				return 0;
			}
		int[] total = new int[triangle.size()]; //total size of the array
		int l = triangle.size() - 1;  //Length
		for(int i = 0 ; i < triangle.get(l).size(); i++){
			total[i] = triangle.get(l).get(i); //
		}
		//Iterate from Last Second Row
		for(int i = triangle.size() - 2;i >=0 ;i--){ //Triangle.size()
			for(int j = 0; j < triangle.get(i+1).size() - 1; j++){
				total[j] = triangle.get(i).get(j) + Math.min(total[j],total[j+1]);
			}
		}
			return total[0];
	}
}
