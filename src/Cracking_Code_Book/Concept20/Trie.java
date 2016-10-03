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

		private void add(String s,int index) { 



		}

		private int findCount(String s,int index) {


		 }
	}
}