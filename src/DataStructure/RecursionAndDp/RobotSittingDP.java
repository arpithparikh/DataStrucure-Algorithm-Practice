//Imagine a robot sitting on the upper left corner of an x by y grid.
//The robot only can move down or right side in the whole grid.
//Measure max possible paths are there for the robot to go from (0,0) to (x,y)?

package DataStructure.RecursionAndDp;

public class RobotSittingDP {

	public int UniquePath(int m,int n)
	{
		//precondition
		if(m<1 || n<1)
		{
			return 0;
		}
		
		//Making the grid
		int[][] f=new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			f[i][0]=1;
		}
		
		for(int i=0;i<n;i++)
		{
			f[0][i]=1;
		}
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				f[i][j]=f[i-1][j]+f[i][j-1];
		
		return f[m-1][n-1];
	}
	
}
