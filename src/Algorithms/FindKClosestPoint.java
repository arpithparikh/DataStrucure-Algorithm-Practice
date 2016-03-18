package Algorithms;

import java.util.Comparator;
import java.util.PriorityQueue;

import Algorithms.FindKClosestPoint.CPoint;



//Maintain a heap of size k.

//For each point, calculate the distance to the point P. Insert that distance into the heap and delete the 
//maximum from the heap if the size of the heap is greater than k.

//Running time: O(n log k)

//@Author :Arpit Parikh

//Following Algorithm is for the find the Kth Closest Point 
class PointComparator implements Comparator<CPoint>
{

	private CPoint origin;
	
	public PointComparator(CPoint originPoint) {
		// TODO Auto-generated constructor stub
		origin=originPoint;
	}

	@Override
	//This method will compare the distance between two point
	public int compare(CPoint o1, CPoint o2) {
		// TODO Auto-generated method stub
		double distance1=distance(o1,origin);
		double distance2=distance(o2,origin);
		return (int) (distance2-distance1);
	}

	//this method is to calculate the distance.
	private double distance(CPoint p1, CPoint p2) {
		// TODO Auto-generated method stub
		
		//Distance formula
		return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p2.y-p2.y));
	}

	
	}

public class FindKClosestPoint {
	
	//CPoints are in the  2D plane
	static class CPoint {
		
		//X axis 
		double x;
		
		//Y axis
		double y;
		
		//Constructor
		CPoint(double a,double b)
		{
			x=a;
			y=b;
		}

	
		//Main method 
	public CPoint[] findKclosestPoints(CPoint[] array, CPoint original,int k)
	{
		
		//this is the default of if the array is null and the length of the array is 0 than it should return 0.
		if(array==null||array.length==0)
		{
			return null;
		}
		//Array of CPoint with K points in the whole 2D plane.
		CPoint[] res=new CPoint[k];
		
		
		//calling the object pc
		PointComparator pc=new PointComparator(original);
	
		//An unbounded priority queue based on a priority heap. The elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used. A priority queue does not permit null elements. A priority queue relying on natural ordering also does not permit insertion of non-comparable objects (doing so may result in ClassCastException). 
		PriorityQueue<CPoint> maxHeap = new PriorityQueue<CPoint>(k, pc);
		
		for(int i=0;i<array.length;i++)
		{
			//maxheap size is less than the number of k->points
			if(maxHeap.size()<k)
			{
				//insert the value in the PriorityQueue
				maxHeap.offer(array[i]);
				
			}
			else
			{
				//compare the head of the queue,
				if(pc.compare(maxHeap.peek(),array[i])==-1)
				{
					//Retrieve and remove the head of this queue
					maxHeap.poll();
					
					//Insert the specified element in the priority queue. 
					maxHeap.offer(array[i]);
				}
			}
		}
	
		//index
		int index=k-1;
		
		while(!maxHeap.isEmpty())
		{
			res[index--]=maxHeap.poll();
		}
				
		return res;
		
	}
	
	
}	

}
