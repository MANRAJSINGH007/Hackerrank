import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] a) {
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        {
            ar[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                ar[0]++;
            }
            else if(a[i]==2)
            {
                ar[1]++;
            }
            else if(a[i]==3)
            {
                ar[2]++;
            }
            else if(a[i]==4)
            {
                ar[3]++;
            }
            else
            {
                ar[4]++;
            }
        }
        
        int max=ar[0];
        int k=0;
        for(int i=1;i<5;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
                k=i;
            }
        }
        
        return k+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
