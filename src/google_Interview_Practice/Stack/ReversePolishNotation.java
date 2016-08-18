//Evalute Reverse Polish Notation 
public class Solution{
	public int evalRPN(String[] tokens){
		String<Integer> s = new String<Integer>();
		String operator = "+-*/";
		for(String token : tokens){
			if(!operator.contain(token)){
				s.push(Integer.valueOf(token));
				continue;
			}
			int a = s.pop();
			int b = s.pop();
			if(toekn.equals('+')){
				s.push(b + a);
			}else if(toekn.equals('-')){
				s.push(b - a);
			}
		}
		return s.pop();
	}
}