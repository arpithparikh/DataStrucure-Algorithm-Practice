/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Interval {
	int start;
	int end;
	public Interval() {
		start = 0;
		end = 0;
	}
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
public class Solution {
	private class Comp implements Comparator<Interval> {
		public int compare(Interval i1, Interval i2) {
			if(i1.start > i2.start) {
				return 1;
			}
			else if(i1.start < i2.start) {
				return -1;
			}
			else {
				return i1.end - i2.end;
			}
		}
	}
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0) {
        	return res;
        }
        Comp cmp = new Comp();
        Collections.sort(intervals, cmp);
        res.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++) {
        	Interval temp = res.get(res.size() - 1);
        	if(temp.end < intervals.get(i).start) {
        		res.add(intervals.get(i));
        	}
        	else {
        		temp.end = Math.max(temp.end, intervals.get(i).end);
        	}
        }
        return res;
    }
}