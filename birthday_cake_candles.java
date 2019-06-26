import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, long[] a) {
        long max=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
