//Stacks: Balanced Brackets

public class BalancedBrackets{
public static char [][] TOKENS = {{'{','}'},{'[',']'},{'(',')'}} ;
	//Check the isBalanced 
	public static boolean isBalanced(String expression){
		//Stack with characters
		Stack<Character> stack = new Stack<Character>();
		//loop through the expression
		for(char c: expression.tocharArray()){
			if(isOpernTerm(c)){
				stack.push(c);
			}else{
				if(stack.isEmpty() || !matches(stack.pop(),c)){
					return false;
				}
			}

		}
			return stack.isEmpty();
	}
	//check whether its open term or not!
	public static boolean isOpernTerm(char c){
		for(char[] array : TOKENS){
			if(array[0] == c){
				return true;
			}
		}
		return false;
	}
	//check whether it matches or not!	
	public static boolean matches(char opernTerm,char closeTerm){
			for(char[] array : TOKENS){
				if (array[0] == opernTerm) {
					return array[1] == closeTerm;
				}
			}
				return false;
	}
}