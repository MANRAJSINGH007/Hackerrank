import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulDays(int i, int j, int k) {
        int counter=0;
        for(int f=i;f<=j;f++)
        {   int x=f;
            int num=x;
            int powers=0;
        while(x!=x%10)
        {
           int rem=x%10;
           x=x/10; 
           powers++; 
            //System.out.println(powers);
        }
         
         x=num;
            // the power variable gives me the power of 10 in the number.
            int reverse=0;
            for(int y=powers;y>=0;y--)
            {
                int rem=x%10;
                reverse+=rem*(Math.pow(10,y));
                x=x/10;
            }
         int diff=reverse-num;
         if(diff>=0)
         {
             if(diff%k==0)
             {
                 counter++;
             }
         }
         else
         {
              if((-diff)%k==0)
             {
                 counter++;
             }
         }
        }
        return counter;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
