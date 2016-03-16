package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Problem find the largest Decent Number having N digits.

//A Decent Number has the following properties:
//Its digits can only be 3's and/or 5's.
//The number of 3's it contains is divisible by 5.
//The number of 5's it contains is divisible by 3.
//If there are more than one such number, we pick the largest one.
public class Sherlock_Beast {
	
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static String repeat(String str,int times)
	{
		StringBuilder ret=new StringBuilder();
		
		for(int i=0;i<times;i++)
		{
			ret.append(str);
			
		
		}
		return ret.toString();
	}
	
	
	
	public static void main(String args[])throws NumberFormatException,IOException{
		
		
		int T=Integer.parseInt(in.readLine());
		
	}

}
