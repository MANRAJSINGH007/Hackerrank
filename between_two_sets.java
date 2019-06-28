import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        // sort the arrays a and b.
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    int temp1=a[j];
                    a[j]=a[i];
                    a[i]=temp1;
                }
            }
        }
         for(int i=0;i<m-1;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                if(b[j]<b[i])
                {
                    int temp1=b[j];
                    b[j]=b[i];
                    b[i]=temp1;
                }
            }
        }
        int m1=a[n-1];
        int m2=b[0];
        int count=0;
        for(int i=m1;i<=m2;i++)
        {   int flag=0;
            for(int j=0;j<n;j++)
            {   
                if((i%a[j])==0)
                {
                    flag++;
                }
            }
            for(int h=0;h<m;h++)
            {
                if((b[h]%i)==0)
                {
                    flag++;
                }
            }
            if(flag==m+n)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
