import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pickingNumbers(int[] a) {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        int freq[]=new int[100];
        // the list has been sorted.
        for(int i=0;i<n;i++)
        {
            int f=a[i];
            freq[f]++;
        }
        int sum=freq[1]+freq[2];
        for(int i=2;i<99;i++)
        {
            if(sum<(freq[i]+freq[i+1]))
            {
                sum=freq[i]+freq[i+1];
            }
        }
               return sum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
