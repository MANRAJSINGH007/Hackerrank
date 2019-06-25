import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void cutTheSticks(int[] a) 
    {
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            a[arr_i] = in.nextInt();
        }
        System.out.println(n);
        int x=100;
        int zero=0;
        while(x>1)
        {
        int min=100000;
        int k=0;
        while(k<n)
        {   if(a[k]>0)
            {
            min=a[k];
            break;
            }
         else
         {
             k++;
         }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<min && a[i]>0)
            {
                min=a[i];
            }
        }
        int count=0;
        /*for(int i=0;i<n;i++)
        {
            if(a[i]==min)
            {
                count++;
            }
            else if(a[i]==0)
            {
                zero++;
            }
        }
        */
        for(int i=0;i<n;i++)
        {   if(a[i]>0)
            {
                a[i]=a[i]-min;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                count++;
            }
        }
            if(count==n)
            {
                break;
            }
            x=n-count;
        System.out.println(x);
        }
        
        in.close();
    }
}
