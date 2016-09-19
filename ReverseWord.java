import java.util.Stack;
//Reverse Word in the String
public class ReverseWord {
	public static String reverse(String string){
			StringBuilder sb = new StringBuilder();
			Stack<String> stack = new Stack<String>();
			int start = 0;
			for(int i = 0 ; i < string.length();i++){	
				if(string.charAt(i) ==' ' ){
				
					String word = string.substring(start, i);
					stack.push(word);
					start = i+1;
				}
			}
			String wordEnd = string.substring(start,string.length());
			stack.push(wordEnd);
			//Stack
			while(!stack.empty()){
				String str =  stack.pop();
				if(stack.size() != 0){
				sb.append(str+" ");}
				else{
					sb.append(str);
				}
			}		
		return sb.toString();
	}
	public static void main(String args[]){
		String sentence = "I love my Xiaobei";
		System.out.print(reverse(sentence));
	}
}
