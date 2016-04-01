//The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

//Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after NN growth cycles?

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            int maxHeight=1;
            
            if(n==0)
             {
                 System.out.println(maxHeight);
                
            }
            else
                {
            
                if(n%2==0)
                    {
                
            for(int i=n;i>=1;i--)
            {
                if(i%2==0)
                {
                    maxHeight=maxHeight*2;
                }
                else
                {
                    maxHeight=maxHeight+1;
                }
            }
                    
                }
                else
                    {
                    
                    for(int i=n;i>=1;i--)
            {
                if(i%2==0)
                {
                    maxHeight=maxHeight+1;
                }
                else
                {
                    maxHeight=maxHeight*2;
                }
            }
                    
                }
            
            System.out.println(maxHeight);
            }
        }
    }
}
