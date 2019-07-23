import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void super_reduced_string(String s){
        // Complete this function
        int n=s.length();
        char ch[]=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=s.charAt(i);
        }
        
        int flag=0;
        while(flag!=1)
        {
            flag=1;
            for(int i=0;i<n-1;i++)
            {
                if(ch[i]==ch[i+1])
                {
                    flag=0;
                    break;
                }
            }
            if(flag==0)
            { for(int i=0;i<n-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                for(int j=i+2;j<n;j++)
                {
                    ch[j-2]=ch[j];
                }
                n=n-2;
                if(n==0)
                {
                    break;
                }
            }
        }
        
             
            }
        }
        if(n==0)
        {
            System.out.println("Empty String ");
        }
        else
        {    
        for(int i=0;i<n;i++)
        {
            System.out.print(ch[i]);
        }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        super_reduced_string(s);
    }
}
