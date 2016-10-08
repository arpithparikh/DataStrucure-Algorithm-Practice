//Connected cells using DFS
//we are having the matrix of zero and one , we need to figure out the region of connected cells in the matrix.
//We need to find one  got dfs to the region get the size of it tracking the bit , afterwards check horizonally , vertically or diagonally 
public class Solution{
	//get Biggest Region
	public static int getBiggestRegion(int[][] matrix){
		int maxRegion = 0;
		for(int row = 0 ; row < matrix.length ; row++){
			for(int column = 0; column < matrix[row].length; column++){
				if(matrix[row][column] == 1){ //matrix row and column

					int size  = getRegionSize(matrix,row,column);
					maxRegion = Math.max(size,maxRegion);

				}
			}
			return maxRegion;
		}
	}
	//getRegion
	public static int getRegionSize(int[][] matrix,int row,int column){
		if(row < 0 || column < 0 || row >= matrix.length || columb >= matrix[row].length){
			return 0;
		}
		if(matrix[row][column] == 0){
		return 0;
		}
		matrix[row][column] = 0;
		int size = 1;
		for(int r = row - 1 ; row <= row + 1;row++){
			for(int c = column - 1; column < = column + 1 ; column++){
				if(r!= row || c!=column){
					size += getRegionSize(matrix,r,c);
				}
			}
		}
		return size;
	}	
	public static void main(String[] args){


	}
}