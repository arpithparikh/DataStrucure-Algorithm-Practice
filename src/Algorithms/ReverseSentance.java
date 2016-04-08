package Algorithms;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
//@author:@rpithparikh //Success 25pt
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
			for(String retval : string.split(" ",findWhiteSpace+1)){
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
			builder.append(" " + map.get(i));
		}
		return builder.toString();
	}
	public static void main(String args[]) throws IOException{	
	String string="foobar";
	
	
	FileWriter fw = new FileWriter("C:\\Users\\arpitparikh\\git\\Interview_Cracking_Journey1\\src\\Algorithms\\B-large-practice (3).out");
	BufferedWriter bw = new BufferedWriter(fw);
	  try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arpitparikh\\git\\Interview_Cracking_Journey1\\src\\Algorithms\\B-large-practice (3).in"))) {
		  int counter=1;  
		  for(String line; ( line = br.readLine()) != null; ) {
		    	
		    	//System.out.println(line);
		    	
		    	if(!line.matches("[a-zA-Z ]*\\d+.*"))
		    	{
		    		bw.write("Case #"+counter+":"+reverseString(line));
		    		System.out.println("Case #" + counter + ":" + reverseString(line));
		    		counter++;
		    	}
		    	//line Separator
		    	bw.write(System.lineSeparator());
		    }
		    // line is not visible here.
		  
		  bw.close();
		}
	   
	
	}
}
