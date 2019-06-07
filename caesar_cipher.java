import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void caesarCipher(String s,int k) {
        // Complete this function
        int n=s.length();
        char ch[]=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=s.charAt(i);
        }
        // converted into a character array.
        
        for(int i=0;i<n;i++)
        {
            
            if(((char)ch[i]>=65 && (char)ch[i]<=90) || ((char)ch[i]>=97 && (char)ch[i]<=122))
            {
                int n1=(int)ch[i];//ascii value of the letter.
                if(n1<=90)
                {
                    n1=n1+k%26;
                    if(n1<=90)
                    {
                        ch[i]=(char)n1;
                    }
                    else
                    {
                        n1=n1-26;
                        ch[i]=(char)n1;
                    }
                }
                else if(n1>=97)
                {
                    n1=n1+k%26;
                    if(n1<=122)
                    {
                        ch[i]=(char)n1;
                    }
                    else
                    {
                        n1=n1-26;
                        ch[i]=(char)n1;
                    }
                }
            }
            else
            {
                
            }
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(ch[i]);
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        caesarCipher(s,k);
        in.close();
    }
}
