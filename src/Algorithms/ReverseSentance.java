package Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

//Given a list of space separated words, reverse the order of the words. Each line of text contains L letters and W words. A line will only consist of letters and space characters. There will be exactly one space character between each pair of consecutive words.
//Input:The first line of input gives the number of cases, N.
//N test cases follow. For each test case there will a line of letters and space characters indicating a list of space separated words. Spaces will not appear at the start or end of a line.
//For each test case, output one line containing "Case #x: " followed by the list of words in reverse order.
public class ReverseSentance {
	public static String reverseString(String string){
		int findWhiteSpace=0;
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) == ' '){
				findWhiteSpace++;
			}
			int counter=0;
			System.out.println(findWhiteSpace);
			for(String retval:string.split(" ",findWhiteSpace+1)){
				map.put(counter, retval);
				counter++;
			}		
		}
		int size=0;
		size=map.size();
		NavigableSet<Integer> keySet = map.navigableKeySet();
		Iterator<Integer> iterator = keySet.descendingIterator();
		StringBuilder builder=new StringBuilder();
		Integer i;
		while(iterator.hasNext()){
			i=iterator.next();
			builder.append(map.get(i));
		}
		return builder.toString();
	}
	public static void main(String args[]){	
	String string="this is a test";
	System.out.println(reverseString(string));
	}
}
