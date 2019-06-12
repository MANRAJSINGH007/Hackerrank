import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gridSearch function below.
    static String gridSearch(String[] G, String[] P) {
        
        String find="";
        for(int i=0;i<P.length;i++)
        {
            find+=P[i];
        }
        
        
        String empty="";
        for(int i=0;i<G.length-P.length+1;i++)
        {
            empty="";
            for(int j=0;j<G[0].length()-P[0].length()+1;j++)
            {
                for(int k=i;k<i+P.length;k++)
                {
                    empty+=G[k].substring(j,j+P[0].length());
                    String y=find.substring(0,(k-i+1)*P[0].length());
                    if(empty.equals(y))
                    {
                        
                    }
                    else
                    {
                        break;
                    }
                }
                
                if(empty.equals(find))
                {
                    return "YES";
                }
                else
                {
                    empty="";
                }
                
            } 
            
            
        }
        
        return "NO";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
