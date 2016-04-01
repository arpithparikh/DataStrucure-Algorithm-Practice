mport java.io.*;
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
            
            String number=Integer.toString(n);
             char array[]=number.toCharArray();
            
               int counter=0;
            for(int i=0;i<array.length;i++)
            {
             
                try
                    {
                 if(n%Character.getNumericValue(array[i])==0)
                 {
                     counter++;
                 }
                }
                catch(Exception e)
                    {
                    
                }
                
            }
            System.out.println(counter);
            
            
        }
    }
}
