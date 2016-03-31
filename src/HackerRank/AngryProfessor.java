import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        //Scanner 
        Scanner in = new Scanner(System.in);
        //number of inputs
        int t = in.nextInt();
   
        for(int a0 = 0; a0 < t; a0++)
        {
            //number of students
            int n = in.nextInt();
            //atleast the student required
            int k = in.nextInt();
            //students
                 int counter=0;
            int a = 0;
            for(int a_i=0; a_i < n; a_i++){
                a = in.nextInt();
                
                 if(a<=0)
            {
                counter++;
            }
        }
            
         
        if(counter>=k)
            {
            System.out.println("NO");
        }else
            {
              System.out.println("YES");
        }
        
            
            
         }
        
