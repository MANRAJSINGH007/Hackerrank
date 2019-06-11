import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the surfaceArea function below.
    static int abs(int a,int b)
    {
        if(a-b>=0)
        {
            return a-b;
        }
        else 
        {
            return b-a;
        }
    }
    static int surfaceArea(int[][] a) {
        
        int cost=0;
        int rows=a.length;
        int cols=a[0].length;
        cost+=2*rows*cols;
        System.out.println(cost);
        for(int i=0;i<rows;i++)
        {
            cost+=a[i][0];
            for(int j=0;j<cols-1;j++)
            {
                cost+=abs(a[i][j],a[i][j+1]);
            }
            cost+=a[i][cols-1];
        }
        System.out.println(cost);
        for(int j=0;j<cols;j++)
        {
            cost+=a[0][j];
            for(int i=0;i<rows-1;i++)
            {
                cost+=abs(a[i][j],a[i+1][j]);
            }
            cost+=a[rows-1][j];
        }
        System.out.println(cost);
        return cost;  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] HW = scanner.nextLine().split(" ");

        int H = Integer.parseInt(HW[0]);

        int W = Integer.parseInt(HW[1]);

        int[][] A = new int[H][W];

        for (int i = 0; i < H; i++) {
            String[] ARowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowItems[j]);
                A[i][j] = AItem;
            }
        }

        int result = surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
