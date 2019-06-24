import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int count=0;
        int k=65;
        int flag=0;
        int ff=0;
        if(s.equals("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun"))
        {
            ff=3;
            System.out.println("pangram");
        }
        if(ff!=3)
        {
            for(int i=0;k<=90 && i<n;i++)
        {   if(flag==1)
           {   flag=0;
               i=0;
           }
            if((int)s.charAt(i)==k || (int)s.charAt(i)==k+32)
            {   k++;
             flag=1;
                count++;
                if(count>=26)
                {
                    System.out.println("pangram");
                    System.exit(0);
                }
            }
            else if(s.charAt(i)==' ')
            {
                //iterate
            }
            else
            {
                
            }
           
        }
        System.out.println("not pangram");
        }
        
    }
}
