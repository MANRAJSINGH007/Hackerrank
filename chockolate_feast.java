import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int chocolateFeast(int n, int c, int m) {
        // Complete this function
        int sum=n/c;
        int wrappers=sum;
        if(wrappers>=m)
        {  int rem=0;
            while(wrappers>=m)        
        {
            rem=wrappers%m;
            int extra=wrappers/m;
            sum=sum+extra;
            wrappers=rem+extra;
            
        }
         return sum;
         
        }
        else
            return sum;
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        in.close();
    }
}
