package DataStructure.TreeGraph;

import java.util.*;

//Prefix Tree
//Each node contain the particular character.
//* indicates the complete word which form its root nodes
//* is the special kind of child which terminate the parent node.
//Moreover, * is flag for ending.

//Use for quick prefix lookup of the words
//Using the Hash table is very easy to say the string is valid word or not!
//But trie can easily say that string is valid prefix in O(K)

class TrieNode
{
	//character 
	char c;
	//HashMap which contains character and trieNode
	HashMap<Character,TrieNode> children =new HashMap<Character,TrieNode>();
	//check the isLeaf node or not
	boolean isLeaf;
	//TrieNode
	public TrieNode(){}
	//another constructor 
	public TrieNode(char c)
	{
		this.c=c;
		
	}
}

//Trie Class
public class Tries {

	//Implementing the root
	private TrieNode root;
	
	//constructor
	public Tries()
	{
		root=new TrieNode();
	}
	
	//insert the word into the trie
	public void insert(String word)
	{
		//HashMap
		HashMap<Character,TrieNode> childeren=new HashMap<Character, TrieNode>();
		
		//loop around the length
		for(int i=0;i<word.length();i++)
		{
			//char c
			char c=word.charAt(i);
			
			//TrieNode
			TrieNode node;
			
			//already contains
			if(childeren.containsKey(c))
			{
				//node would be set as node
				node=childeren.get(c);
			}
			else
			{
				//create the new node with the particular character.
				node=new TrieNode(c);
				//inserting the new node
				
				childeren.put(c, node);
			}
			
			//set leaf node
			
			if(i==word.length()-1)
			{
				node.isLeaf=true;
			}
			
					
		}
	}
	
	public boolean search(String word)
	{
		//Search the Node
		TrieNode node=searchNode(word);
		
		//node is not null and 
		if(node!=null || node.isLeaf)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	//Find the Prefix
	
	public boolean StartWith(String prefix)
	{
		if(searchNode(prefix)!=null)
		{
			return true;
		}
		return false;
	}
	
	
	
//Search the node prefix
	private TrieNode searchNode(String word) {
		// TODO Auto-generated method stub
		
		Map<Character,TrieNode> children=new HashMap<Character, TrieNode>();
		
		TrieNode node=null;
		
		for(int i=0;i<word.length();i++)
		{
			//character
			char c =word.charAt(i);
			
			if(children.containsKey(c))
			{
				node=children.get(c);
			children=node.children;
			}
			
			else
				return null;
				
		}
		
		
		return node;
	}
	
	
	
	
		
	
}
