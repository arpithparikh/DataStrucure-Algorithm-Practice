//Valid Parenthese
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
public class Solution{
	public boolean isValidParentheses(String s){
			Stack<Character> stack = new Stack<Character>();
			for(int i = 0; i <s.length();i++){
				char c = s.charAt(i);
				if(s.charAt(i)=='{' || s.charAt(i) == '[' || s.charAt(i) == '('){
					stack.push(c);
				}else
				{
				if(!stack.isEmpty() && isValid(stack.peek(),s.charAt(i))){
					stack.pop();
					}else{
					return false
					}
				}
			}			
			return stack.isEmpty();
	}
	public void isValid(char a, char b){
		if((a=='{' && b == '}')){
		return true;
		}else{
		return false;
		}
	}
}