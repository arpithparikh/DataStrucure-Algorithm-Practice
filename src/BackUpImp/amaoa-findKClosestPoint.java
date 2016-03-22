import java.util.*;
class PointComparator implements Comparator<CPoint> {
	private CPoint origin;
	PointComparator(CPoint originPoint) {
		origin = originPoint;
	}
	public int compare(CPoint o1, CPoint o2) {
		double distance1 = distance(o1, origin);
		double distance2 = distance(o2, origin);
		return distance2 - distance1;
	}
	private double distance(CPoint p1, CPoint p2) {
		return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
	}
}
public class find {
	static class CPoint{
		double x;
		double y;
		CPoint(double a, double b){
			x = a;
			y = b;
		}
	}
	public static CPoint[] findKclosestPoints(CPoint[] array, CPoint original, int k){
		if(array == null || array.length == 0) {
			return null;
		}
		CPoint[] res = new CPoint[k];
		PointComparator pc = new PointComparator();
		PriorityQueue<CPoint> maxHeap = new PriorityQueue<CPoint>(k, pc);
		for(int i = 0; i < array.length; i++) {
			if(maxHeap.size() < k) {
				maxHeap.offer(array[i]);
			}
			else {
				if(pc.compare(maxHeap.peek(), array[i]) == -1) {
					maxHeap.poll();
					maxHeap.offer(array[i]);
				}
			}
		}
		int index = k - 1;
		while(!maxHeap.isEmpty()) {
			res[index--] = maxHeap.poll();
		}
	}

	
	public static void main(String[] args) {

	}
}