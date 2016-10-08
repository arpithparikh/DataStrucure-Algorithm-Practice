//	Tries : Solving contacts 
public class Solution{
	

	public static class Node{
		//Number of Characters
		private static int NUMBER_OF_CHARACTERS = 26;
		//Children 
		Node[] children = new Node[NUMBER_OF_CHARACTERS]; // store each children

		private static int getCharIndex(char c){

			return c - 'a';
		}
		private Node getNode(char c) { 

			return children[getCharIndex(c)];
		}

		private void setNode(char c,Node node) { 

			children[getCharIndex(c)]  = node;

		}

		private void add(String s) { 

			add(s , 0);

		}
		//Adding Node in Trie
		private void add(String s,int index) { 
			if (index == s.length()) {
				return;
			}
			char current = s.charAt(index); //current
			int charCode = getCharIndex(current);//charCode
			Node child - getNode(current); //getNode -> Child Node
			if(child == NULL){ //child  == null
				child = new Node(); // child Node
				setNode(current,child); // setting Node
			}
				child.add(s,index + 1); // adding 
		}

		//finding 
		private int findCount(String s,int index) {
			if(index ==  s.length())
				return size;
			Node child = getNode(s.charAt(index));
			if(child == null)
				return 0;
			return child.findCount(s, index + 1);
		 }
	}
}