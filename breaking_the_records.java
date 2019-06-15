import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] a) {
        int n=a.length;
        int min=a[0];
        int max=a[0];
        int c1=0;
        int c2=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                c1++;
            }
            else if(a[i]<min)
            {
                min=a[i];
                c2++;
            }
            else
            {
                
            }
        }
        int arr[]=new int[2];
        arr[0]=c1;
        arr[1]=c2;
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
