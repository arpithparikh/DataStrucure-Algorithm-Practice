//Merge Intervals 
public class Interval{	
	int start, end;
	Interval(int start, int end){
		this.start = start;
		this.end = end;
	}
}
public class Solution{
	
	public List<Interval> merge(List<Interval> intervals){
		if(intervals == null || intervals.size() < = 1){
			return itervals ;
		}
		Collection.sort(intervals,new IntervalComparator());
		List<Interval> result= new ArrayList<Interval>();
		Interval last = intervals.get(0);
		for(int i = 1; i < intervals.size() ; i++){
			Intervals curt = intervals.get(i);
			if(curt.start < last.end){
				last.end = Math.max(last.end,curt.end);
			}else{
				result.add(last);
				last = curt;
			}
			result.add(last);
			return result;
		}
	}
}
public class IntervalsComparator implements Comparator<Interval>{	
	public int compare(int a,int b){
		return a.start - b.start;
	}
}