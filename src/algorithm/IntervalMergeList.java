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
}{"__v":0,"flag":0,"activated":false,"password":"d911cf8f7aef075391e5dc0d2c9a746a","fname":"ARPIT","lname":"PARIKH","community":"gwu","picurl":"","studenttype":"","gradyear":null,"religion":"","aboutme":"I am awesome!","lastlogin":"2016-07-27T13:45:03.328Z","_id":"5798badfcc5b34e44f936281","passcode":"","question":0,"keywords":[],"evtrsvp":[],"grp":[],"providerLKData":{"provider":"","providerId":"","OauthToken":""},"providerFBData":{"provider":"Facebook","providerId":" ","OauthToken":""},"minor":[""],"major":[""],"email":{"uid":"arpih@gwu.edu","fbid":"","linid":""}}


{"__v":0,"flag":0,"activated":false,"password":"d911cf8f7aef075391e5dc0d2c9a746a","fname":"ARPIT","lname":"PARIKH","community":"gwu","picurl":"","studenttype":"","gradyear":null,"religion":"","aboutme":"I am awesome!","lastlogin":"2016-07-27T13:45:03.328Z","_id":"5798badfcc5b34e44f936281","passcode":"","question":0,"keywords":[],"evtrsvp":[],"grp":[],"providerLKData":{"provider":"","providerId":"","OauthToken":""},"providerFBData":{"provider":"Facebook","providerId":" ","OauthToken":""},"minor":[""],"major":[""],"email":{"uid":"arpih@gwu.edu","fbid":"","linid":""}}

57924d5f6210490ac190f053

57924a846210490a907a1a44

