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
	
	
	//Similar to scanner
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	//To produce the largest decent number based on the condition
	public static String repeat(String str,int times)
	{
		//A mutable sequence of character,the class provides faster instead of StringBuffer
		StringBuilder ret=new StringBuilder();
		
		for(int i=0;i<times;i++)
		{
			//Provides append and insert methods.Append more than two strings.
			ret.append(str);
		}
		
		return ret.toString();
	}
	
	
	
	public static void main(String args[])throws NumberFormatException,IOException{
		
		
		//
		int T=Integer.parseInt(in.readLine());
		
		for(int i=0;i<T;i++){
		
		// empty string
		String s = "";
			
		//
		int N = Integer.parseInt(in.readLine());

		for(int j=N;j>=0;j--)
		{
				if(j%3==0 && (N-j)%5==0)
				{
					s=repeat("5",j)+repeat("3",N-j);
					break;
				}
		}
			
		if(s=="")
			System.out.println("-1");
			
		else
			System.out.println(s);
			
			in.close();
			
			
		}
		
		
	}

}
