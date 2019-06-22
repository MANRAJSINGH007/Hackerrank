import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int jumpingOnClouds(int[] c, int k) {
        int n=c.length;
        int jumps=n/k;
        int res=100;
        int pointer=0;
        for(int i=0;i<jumps;i++)
        {
            pointer=pointer+k;
            if(c[pointer%n]==1)
            {
                res=res-3;
            }
            else
                res--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
