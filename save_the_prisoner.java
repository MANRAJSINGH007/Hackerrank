import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s){
        
        
        /*int pointer=s;
        for(int i=2;i<=m;i++)
        {   if(pointer==n)
            {
            pointer=0;
            }
            pointer=pointer+1;
        }
        return pointer;
        */
        
        int pointer=s;
        int rem=n-s;
        if(n-s+1>=m)
        {
        return s+m-1;
        }
        else
        {
            m=m-(n-s+1);
            if(m%n==0)
            {
                return n;
            }
            else
                return m%n;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
