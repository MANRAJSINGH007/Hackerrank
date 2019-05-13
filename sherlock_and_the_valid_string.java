import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.HashMap;


public class Solution{

    // Complete the isValid function below.
    static String isValid(String s) {
        int n=s.length();
        if(n==1)
        {
            return "YES";
        }
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        int c[]=new int[26];
        for(int i=0;i<n;i++)
        {
            int val=(int)ch[i]-97;
            c[val]++;
        }
        Arrays.sort(c);
        int j=0;
        while(c[j]==0)
        {
            j++;
        }
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=j;i<26;i++)
        {
            map.put(c[i],c[i]);
        }
        if(map.size()>2)
        {
            return "NO";
        }
        else if(map.size()==1)
        {
            return "YES";
        }
        else
        {
            //map size is 2.
            int num1=c[j];
            int num2=0;
            for(int i=j+1;i<26;i++)
            {
                if(c[i]!=num1)
                {
                    num2=c[i];
                    break;
                }
            }
            int c1=0;
            int c2=0;
            
            for(int i=j;i<26;i++)
            {
                if(c[i]==num1)
                {
                    c1++;
                }
                else
                {
                    c2++;
                }
            }
            
            if(num1==1)
            {
                if(c1==1)
                {
                    return "YES";
                }
                else
                {
                    if(c2==1 && num2==2)
                    {
                        return "YES";
                    }
                    return "NO";
                }
            }
            else
            {
                if(c2==1 && num2==num1+1)
                {
                    return "YES";
                }
                return "NO";
            }
            
        }
        
        

    }

    public static void main(String[] args) throws IOException {
       
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        System.out.println(isValid(x));
    }
}
