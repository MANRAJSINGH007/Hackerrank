import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        double n=arr.length;
        double c1=0;
        double c2=0;
        double c3=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                c1++;
            }
            else if(arr[i]<0)
            {
                c2++;
            }
            else
            {
                c3++;
            }
        }
        System.out.println(c1/n);
        System.out.println(c2/n);
        System.out.println(c3/n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
