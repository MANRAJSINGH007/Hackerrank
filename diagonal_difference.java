import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a,int n) {
        int sum1=0;
        for(int i=0,j=0;(i<n) && (j<n);i++,j++)
        {
            sum1+=a[i][j];
        }
        int sum2=0;
        for(int i=0,j=n-1;(i<n) && (j>=0);i++,j--)
        {
            sum2+=a[i][j];
        }
        if((sum2-sum1)>=0)
        {
            return (sum2-sum1);
        }
        else
        {
            return (sum1-sum2);
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}
