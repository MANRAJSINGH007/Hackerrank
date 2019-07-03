import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(long[] arr) {
        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[j]<arr[i])
                {
                    long temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        //sorted array.
        long min=arr[0]+arr[1]+arr[2]+arr[3];
        long max=arr[4]+arr[1]+arr[2]+arr[3];
        System.out.print(min+" "+max);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        miniMaxSum(arr);
        in.close();
    }
}
