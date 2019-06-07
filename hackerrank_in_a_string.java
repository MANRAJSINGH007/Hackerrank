import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String hackerrankInString(String s) {
        // Complete this function
        int n=s.length();
        char ch[]=new char[n];
        String r="hackerrank";
        char ch2[]=new char[10];
        for(int i=0;i<10;i++)
        {
            ch2[i]=r.charAt(i);
        }
        for(int i=0;i<n;i++)
        {
            ch[i]=s.charAt(i);
        }
        int index=0;
        for(int i=0;i<n && index<10;i++)
        {
            if(ch[i]==ch2[index])
            {
                index++;
                 if(index==10)
        {
            return "YES";
        }
            }
            else
            {
                
            }
        }
        if(index!=10)
        {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
